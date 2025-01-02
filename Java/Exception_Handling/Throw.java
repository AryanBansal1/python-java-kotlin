package Exception_Handling;

import java.util.Scanner;

class ErrorMsg extends RuntimeException{        // Runtime exception - Unchecked Exception
     ErrorMsg(String msg){
        super(msg);
    }
}

public class Throw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age :");
        int age = sc.nextInt();
        if(age<18){
            throw new ErrorMsg("You are not eligible for voting");
        }
        else{
            System.out.println("vote successful");
        } 
        System.out.println("Hello you will not reach here until you use try and catch ");
    }
}
