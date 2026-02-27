package Hashing_package;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class FindItenaryFromTicket {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("Chennai", "Bengaluru");
        map.put("Mumbai","Delhi");
        map.put("Goa","Chennai");
        map.put("Delhi","Goa");

        // Self approach (Time complexity O(n2) because for loop into contains)
        String source = "";
        //Finding the source (which is in from column but not in to column)
        Set<String> keys = map.keySet();
        for(String key : keys){
            if(!map.values().contains(key)){
                System.out.println("The source is : "+key);
                source=key;
            }
        }
        System.out.print(source);
        while(map.keySet().contains(source)){
            System.out.print("-> "+ map.get(source));
            source = map.get(source);
        }
        System.out.println();
        // Finding the destination (which is in to column but not in from column)
        ArrayList<String> values = new ArrayList<>(map.values());
        for(String val : values){
            if(!map.keySet().contains(val)){
                System.out.println("The destination is : "+ val);
            }
        }


        // Approach 2 : better approach as it uses containkey rather than contain (Time Complexity O(n))
        // Step 1: Build destination set
        HashMap<String, Boolean> destMap = new HashMap<>();
        for (String dest : map.values()) {
            destMap.put(dest, true);
        }

        // Step 2: Find source
        String start = null;
        for (String src : map.keySet()) {
            if (!destMap.containsKey(src)) {
                start = src;
                break;
            }
        }

        // Step 3: Print itinerary
        System.out.print(start);
        while (map.containsKey(start)) {
            System.out.print(" -> " + map.get(start));
            start = map.get(start);
        }
    

    }
}
