import java.util.Scanner;
public class loop {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        /*  for loop
        for(int i = 1 ;i<=n;i++){
        sum+=i ;   
        }
        System.out.print(sum);
        */

    //while loop
    int i =1;
    while(i<=n){
        sum+=i;
        i++;
    }
    System.out.print(sum);
    }
}