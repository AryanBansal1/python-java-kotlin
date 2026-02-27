package array_package;
import java.util.*;
public class TwoDArray{


    // CREATING A SEARCHING CLASS
    public static Boolean search2DArray(int matrix[][],int key){
        for(int row=0;row<matrix.length;row++){
            for(int col=0;col<matrix[0].length;col++){
                if(matrix[row][col]==key){
                    System.out.println("the key is at"+row+","+col);
                    return true;
                }
                
            }
        }
        System.out.println("Key not found");
        return false;
        
    }

    // Finding the maximum or minimum value 
    public static void maxMin(int matrix[][]){
        int minelement = Integer.MAX_VALUE;
        int maxelement=Integer.MIN_VALUE;
        for(int row=0;row<matrix.length;row++){
            for(int col=0;col<matrix[0].length;col++){
                maxelement = Math.max(maxelement, matrix[row][col]);
                minelement = Math.min(minelement, matrix[row][col]);
            }
        }
        System.out.println("highest number is "+maxelement);
        System.out.println("lowest number is "+minelement);
    }

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        // CREATING TWO DIMENSIONAL ARRAY
        int Matrix[][] = new int[4][3];

        //  INSERTING VALUES
        System.out.println("Enter the matrix value");
        for(int row=0;row<4;row++){
            for(int col=0;col<3;col++){
                Matrix[row][col] = sc.nextInt();
            }
        }

        // OUTPUT
        for(int row=0;row<4;row++){
            for(int col=0;col<3;col++){
                System.out.print(Matrix[row][col]+ " ");
            }
            System.out.println();
        }
        //search2DArray(Matrix,7);
        //maxMin(Matrix);
        //System.out.println(Matrix[2][2]);
    }
}