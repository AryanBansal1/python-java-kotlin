package collections;

import java.util.Stack;

public class stackLst {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(57);
        s.push("aryan");
        s.push(101.52);
        System.out.println(s);
        // peak just revert the topmost element
        System.out.println(s.peek());
        System.out.println(s);
        // pop revert and remove the topmost element from stack
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.search(57));
        System.out.println(s.empty());
        
    }
}
