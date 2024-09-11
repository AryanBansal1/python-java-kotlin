package arrlist;

import java.util.ArrayList;
import java.util.Iterator;

public class Max_ele {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(5);
        list.add(9);
        list.add(7);
        list.add(48);
        list.add(64);
        list.add(41);
        // Iterator itr = list.iterator();
        // while(itr.hasNext()){
        //     System.out.print(itr.next()+ " ");
        //}
        int max = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            max = Math.max(max, list.get(i));
        }
        System.out.println(max);
    }
}
