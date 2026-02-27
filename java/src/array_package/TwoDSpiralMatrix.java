package array_package;
public class TwoDSpiralMatrix {

    public static void spiralmatrix(int matrix[][]){
        int strtrow =0;
        int strtcol=0;
        int endrow =matrix.length-1;
        int endcol = matrix[0].length-1;
        // USED EQUAL TO FOR CASE WHERE ONE ELEMENT IS LEFT IN CENTER AND && FOR SHAPES WHERE ROW OR COLUMN ONE IS GREATER THAN OHTER
        while(strtrow<=endrow && strtcol<=endcol){

            //for Top
            for(int j=strtcol;j<=endcol;j++){
                System.out.print(matrix[strtrow][j]+" ");
            }
            // for right
            for(int i=strtrow+1;i<=endrow;i++){
                System.out.print(matrix[i][endcol]+" ");
            }
            // for bottom
            for(int k=endcol-1;k>=strtcol;k--){
                if(strtrow==endrow){
                    break;
                }
                System.out.print(matrix[endrow][k]+" ");
            }
            //for left
            for(int l=endrow-1;l>strtrow;l--){
                if(strtcol==endcol){
                    break;
                }
                System.out.print(matrix[l][strtcol]+" ");
            }
            strtrow++;
            strtcol++;
            endcol--;
            endrow--;
        }
    }

    public static void main(String[] args) {
        int matrix [][]= {{1,2,3,13},
                          {4,5,6,14},
                          {7,8,9,15},
                          {10,11,12,16}}; 
        spiralmatrix(matrix);
                            
    }
}
