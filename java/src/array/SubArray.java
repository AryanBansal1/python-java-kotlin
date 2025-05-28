// BRUTE FORCE METHOD

public class SubArray {

    public static void subarr(int arr[]){
        int tp = 0;
        //to make pair of each element
        for(int i=0;i<arr.length;i++){
            //to give end point to each pair
            for(int j =i;j<arr.length;j++){
                System.out.print("(");
                //to actualy print
                for(int k =i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                tp++;
                System.out.print(") ");
            }
            System.out.println();
            
        }
        System.out.println("Total Pairs= "+tp);
    }

    public static void main(String[] args) {
         int arr[] = {2,4,6,8,9};
         subarr(arr);
    }

    



}
