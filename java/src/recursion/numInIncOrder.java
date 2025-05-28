package recursion;
import java.util.*;
public class numInIncOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        numIncOrder(x);
        
    }


    static void numIncOrder(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        else{
            numIncOrder(n-1);
            System.out.println(n);
        }
    }
}
