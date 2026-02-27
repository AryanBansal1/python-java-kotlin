package Queue_package;
 
import java.util.*;
public class InterLeaveTwoHalfOfQueue {

    // Time Complexity O(n) and space complexity O(n)
    public static void twohalfofQueue(Queue<Integer> q){
        int size = q.size()/2;
        Queue <Integer> helperQ = new LinkedList<>();
        for(int i=0;i<size;i++){
            helperQ.add(q.remove());
        }
        while(!helperQ.isEmpty()){
            q.add(helperQ.remove());
            q.add(q.remove());
        }
    }

    public static void main(String[] args) {
        Queue <Integer> q= new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10); 
        twohalfofQueue(q);
        System.out.println(q);
    }
}
