import java.util.*;
public class factorialByLoop {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorial =1;
        for(int i = 1;i<=n;i++){
            if(n==0)
            {factorial = 1;
                break;}
            factorial *=i;
        }
        System.out.print(factorial);
    }
}