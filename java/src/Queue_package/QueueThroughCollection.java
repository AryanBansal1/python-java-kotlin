package Queue_package;

import java.util.*;

public class QueueThroughCollection {
    public static void main(String[] args) {

        // Can be initalize with LinkedList or ArrayDeque only 

        Queue<Integer> q = new LinkedList<>();

        Queue<Integer> q2 = new ArrayDeque<>();

        q.add(54);
        q.add(43); 
        q.add(32);

        while(!q.isEmpty()){
            System.out.println(q.remove());
        }


    }
}
