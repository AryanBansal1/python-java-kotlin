package recursion;

import java.util.Scanner;

public class SumOfNatNum {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    System.out.println(sumofN(x));
    }

    static int sumofN(int n){
        if (n==1){
            return n;
        }
        else {
            return n+sumofN(n-1);
        }
    }
}
