package collections;

import java.util.LinkedList;

public class linklst {
    public static void main(String[] args) {
    // Contains some extra function (Collection, List and Deque methods)
        LinkedList ll =new LinkedList();
        ll.add("aryan");
        System.out.println(ll);
        ll.addFirst("first");
        ll.addLast("last");
        System.out.println(ll);
        System.out.println(ll.getFirst());
        ll.removeLast();
        System.out.println(ll);


    }


}
