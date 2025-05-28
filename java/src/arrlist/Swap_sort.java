package arrlist;

import java.util.ArrayList;
import java.util.Collections;

public class Swap_sort {

    public static ArrayList<Integer> swap2element(ArrayList<Integer> list , int idxa, int idxb ){
       int temp = list.get(idxa);
       list.set(idxa, list.get(idxb));
       list.set(idxb, temp);
        return list;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(32);
        list.add(8);
        list.add(17);
        list.add(57);
        list.add(48);
        System.out.println(list);
        swap2element(list, 1, 4);
        System.out.println(list);

        // sorting 
        Collections.sort(list);
        System.out.println(list);

        // Reverse Sorting 
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
