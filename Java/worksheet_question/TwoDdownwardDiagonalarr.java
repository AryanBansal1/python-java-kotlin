import java.util.ArrayList;

public class TwoDdownwardDiagonalarr {

    public static void downworddiagnol(int n, int arr[][]){
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int col=0;col<n;col++){
            int row=0;
            int tempCol = col;
            while(tempCol>=0 ){
                System.out.print(arr[row][tempCol]+" ");
                tempCol--;
                row++;
            }
        }

    }

    

    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        downworddiagnol(3, arr);
    }
}
