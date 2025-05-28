import java.util.*;
public class armstrongNumber {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = n;
        int k = String.valueOf(n).length();
        int sum = 0;
        while(n>0){
            int digit = n%10;
            int digitcube = (int)Math.pow(digit,k);
            sum+=digitcube;
            n = n/10;
        }
        if (sum==y){System.out.print("It is armstrongnumber");}
        else {System.out.print("Not an armstrongnumber");}
        sc.close();
    } 
}
