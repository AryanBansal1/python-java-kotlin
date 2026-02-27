package array_package;
public class TwoDdiagonalSum {

    public static void Diagonalsum(int matrix[][]){
        int sum =0;
        for(int i=0;i<matrix.length;i++){
            // for primary diagonal
            sum+=matrix[i][i];

            // For Secondary diagonal
            //condition for odd matrix to avoid overlapping (i != j)
            if(i!= matrix.length-1-i){
                sum+=matrix[i][matrix.length-1-i];
            }
        }
        System.out.println();
        System.out.print(sum);

        // for secondary diagonal a bit lengthy one but done self 
        // int j=0;
        // int k=matrix[0].length-1;
        // while(k>=0 && j<matrix.length){
        //     sum+=matrix[j][k];
        //     System.out.print(matrix[j][k]+" ");
        //     j++;
        //     k--;
        // }
        
        
    }
        

    
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        
        Diagonalsum(matrix);
    }
}
