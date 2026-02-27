package Hashing_package;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetLearn {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("India");
        set.add("UK");
        set.add("China");
        set.add("UK");
        set.add("India");
        set.add(null);
        set.add(null);
        System.out.println(set);
        System.out.println(set.size());
        //set.clear();
        //System.out.println(set.isEmpty());

        // Iterating using built in iterator
        Iterator i = set.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("India");
        lhs.add("UK");
        lhs.add("China");
        System.out.println();
        System.out.println("printing LinkedHashSet");
        // advance for loop
        for(String j : lhs){
            System.out.println(j);
        }

        TreeSet<String> ts = new TreeSet<>();
        ts.add("India");
        ts.add("UK");
        ts.add("China");
        System.out.println();
        System.out.println("printing treeset");
        Iterator itr = ts.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
