import java.util.Scanner;
public class creatingArray {
    public static void main(String[] args) {
     
     // datatype name [] = new datatype [size];
     //new will allocate space 
        int marks [] = new int[5];
        // take the values from user
        Scanner sc = new Scanner(System.in);
        marks[0]= sc.nextInt();
        marks[1]= sc.nextInt();
        marks[2]= sc.nextInt();

     // datatype name []= {array elements};   
        int marked[] = {50,70,88,90};

    // for accessing each element of array
    // if the int array is empty it will assume the elements to be zero 
       for (int i = 0; i < marks.length ; i++){
        System.out.println(marks[i]);
       }
        
        System.out.println();
        for (int i = 0; i<marked.length; i++){
            System.out.println(marked[i]);
        }
    }
    
}
