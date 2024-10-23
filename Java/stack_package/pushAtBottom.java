package stack_package;

import java.util.Stack;

public class pushAtBottom {

    public static void pushBottom(Stack<Integer> s,int val){
        if(s.isEmpty()){
            s.push(val);
            return;
        }
        int top = s.pop();
        pushBottom(s, val);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(2);
        s.push(1);
        pushBottom(s, 4);
        System.out.println(s);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
