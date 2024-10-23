package stack_package;

import java.util.Stack;

public class reverse_A_String {
    public static String reverse(String s){
        Stack<Character> stk = new Stack<>();
        for(int i=0;i<s.length();i++){
            stk.push(s.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        while(!stk.isEmpty()){
            sb.append(stk.pop());
        }
        return sb.toString();
        
    }
    public static void main(String[] args) {
        String s = "lasnab";
        System.out.println(reverse(s)); 
    }
}
