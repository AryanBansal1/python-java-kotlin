package Queue_package;
// Double Ended Queue

import java.util.*;
public class ImpDeQue {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(4);
        deque.addFirst(2);
        deque.addLast(3);
        deque.addLast(5);
        System.out.println(deque);
        deque.removeFirst();
        System.out.println(deque);
        System.out.println("The first element is : "+deque.getFirst());
        System.out.println("The last element is : "+deque.getLast());
    }
}
