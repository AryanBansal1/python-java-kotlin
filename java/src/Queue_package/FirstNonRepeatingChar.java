package Queue_package;
import java.util.*;
public class FirstNonRepeatingChar {

    // All characters are in LowerCase
    public static void PrintingFirstNonRepeatingChar(String s){
        Queue<Character> q = new LinkedList<>();
        int [] count = new int[26];
        for(int i=0;i<s.length();i++){
            char a = s.charAt(i);
            q.add(a);
            count[a -'a']++;

            while(!q.isEmpty() && count[q.peek()-'a']>1){
                q.remove();
            }
            if(q.isEmpty()){
                System.out.println(-1);
            }
            else{
                System.out.println(q.peek());
            }
        }
    }

    public static void main(String[] args) {

        PrintingFirstNonRepeatingChar("aabccxb");
    }
}
