import java.util.*;
public class factorialByFunction {
    
    public static int factorial(int a){
        if(a==0){return 1;}
        else{return a * factorial(a-1);}
    }
    
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int inputed = sc.nextInt();
        System.out.println(factorial(inputed));
    }
}
