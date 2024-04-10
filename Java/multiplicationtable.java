import java.util.*;
public class multiplicationtable {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int product;
        for(int i = 1;i<=10;i++){
            product = i*n;
            System.out.println(n+" multiple by "+i +" equal to "+product);
        }
    }
}
