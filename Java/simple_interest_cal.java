import java.util.Scanner;
public class simple_interest_cal {
    public static void main(String[] args){
    Scanner si = new Scanner(System.in);
    int x = si.nextInt();
    int y = si.nextInt();
    int z = si.nextInt();
    int calc = (x*y*z)/100;
    System.out.println("Simple Interest = "+calc);

    }
}
