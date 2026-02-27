package Hashing_package;

import java.util.HashMap;
public class HashMapLearn {
    public static void main(String[] args) {
        // Creation
        HashMap<String,Integer> hm = new HashMap<>();

        //Insertion
        hm.put("India", 4);
        hm.put("China", 1);
        hm.put("UK", 2);
        hm.put("Russia", 3);

        hm.put("India", 6);

        //Getting
       System.out.println(hm.get("India")); 
       //if key doesnt exists it returns null 
       System.out.println(hm.get("Germany"));

        // ContainsKey Check if key exists or not
        System.out.println(hm.containsKey("Germany"));

        //Remove the valid key 
        System.out.println(hm.remove("UK"));
        // if no such key
        System.out.println(hm.remove("Germnay"));

       System.out.println(hm);

       // hashmap size 
       System.out.println(hm.size());

       System.out.println(hm.isEmpty());
       hm.clear();
       System.out.println(hm.isEmpty());

    }
}
