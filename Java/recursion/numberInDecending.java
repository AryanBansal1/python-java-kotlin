package recursion;
import java.util.*;
public class numberInDecending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        decendingnum(x);

        // through for loop
        // for(int i = x; i>=0;i--){
        //     System.out.println(i);
        // }
    }


    // through recursion
    static Boolean decendingnum(int a){
        if(a==0){
            return true;
        }
        else{
            System.out.println(a);
            decendingnum(a-1);
        }
        return false;

    }
}
