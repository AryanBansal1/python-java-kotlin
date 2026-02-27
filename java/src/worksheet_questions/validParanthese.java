package worksheet_questions;
import java.util.Stack;

public class validParanthese {

    public static Boolean checkvalidprnthese(String s){
        Stack<Character> st = new Stack<Character>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(')');
            }
            else if (s.charAt(i)=='{'){
                st.push('}');
            }
            else if(s.charAt(i)=='['){
                st.push(']');
            }
            else if (st.isEmpty() || st.pop() != s.charAt(i)){
                return false;
            }   
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        String s ="([])";
        checkvalidprnthese(s);
    }
}
