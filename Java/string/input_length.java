package string;

import java.util.Scanner;

public class input_length {
    public static void main (String args []){
        
        //  JAVA STRINGS ARE IMMUTABLE 
        Scanner sc = new Scanner(System.in);
        String name ;
        name = sc.nextLine();
        System.out.println(name);
        System.out.println(name.length());
    }
}
