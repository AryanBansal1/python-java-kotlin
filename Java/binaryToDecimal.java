import java.util.*;
public class binaryToDecimal {

    public static int BToD(int num){
        int k =0;
        int sum = 0;
        while(num>0){
        int lastdigit = num%10;
        double product =lastdigit * Math.pow(2,k);
        sum+=product;
        k++;
        num /=10;}
        return sum;
    }

    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you Binary number");
        int number = sc.nextInt();
        System.out.println(BToD(number));

        sc.close();
    }
}
