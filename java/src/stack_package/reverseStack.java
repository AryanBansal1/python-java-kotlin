package stack_package;

import java.util.Stack;

public class reverseStack {

    public static void addBottom(Stack<Integer> s , int val){
        // base case
        if(s.isEmpty()){
            s.push(val);
            return;
        }
        int res = s.pop();
        addBottom(s, val);
        s.push(res);

    }

    public static void revStack(Stack<Integer> s){
        //base case
        if(s.isEmpty()){
            return;
        }
        int val = s.pop();
        revStack(s);
        addBottom(s, val);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(10);
        s.push(15);
        s.push(20);
        addBottom(s, 5);
        System.out.println(s);
        revStack(s);
        System.out.println(s);
    }
}
