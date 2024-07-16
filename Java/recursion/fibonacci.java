package recursion;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(fibonacciNum(x));
    }

    // TIME COMPLEXITY = O(2^N) AND SPACE COMPLEXITY = O(N)

    static int fibonacciNum(int n ){
        if(n==0 || n==1){
            return n;
        }
        else{
            return fibonacciNum(n-1) + fibonacciNum(n-2);
        }
    }
}
