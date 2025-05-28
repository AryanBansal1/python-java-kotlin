import java.util.*;
public class firstfunction {
    // Constructing function
    public static void printfunction(){
        System.out.println("Hello World");
        System.out.println("Hello World");
    }
    // Creating SUM Function
    public static int sumfunction(int a , int b){
        int sum = a+b;
        return sum;
    }




    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        // Calling the FirstFunction
        printfunction();

        // Calling the Sum Function
        int sum = sumfunction(a,b);
        System.out.println(sum);
    }
}
