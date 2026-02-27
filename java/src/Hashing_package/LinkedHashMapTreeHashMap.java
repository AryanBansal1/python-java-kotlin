package Hashing_package;

import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class LinkedHashMapTreeHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
        map.put("India", 50);
        map.put("China", 100);
        map.put("UK", 150); 

        TreeMap<String,Integer> tmap = new TreeMap<>();
        tmap.put("India", 50);
        tmap.put("China", 100);
        tmap.put("UK", 150); 

        System.out.println(map);
        System.out.println(tmap);

    }

}
