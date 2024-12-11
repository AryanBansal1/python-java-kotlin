package string;
import java.util.Scanner;

public class RemoveConsChar {

    public static String removeChar(String S){
        StringBuilder str = new StringBuilder("");
        str.append(S.charAt(0));
        for(int i=1;i<S.length();i++){
            if(S.charAt(i)!=S.charAt(i-1)){
                str.append(S.charAt(i));
            }
        }
        return str.toString();
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        System.out.println(removeChar(S));
    }
}
