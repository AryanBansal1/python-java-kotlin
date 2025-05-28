package sorting;

public class BubbleSort {

    public static void Bsort(int arr[]){
        
        for(int i=0;i<arr.length-1;i++){
            for(int j=0; j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    GeneralFunction.swap(arr,j,j+1);
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        };
    }

    public static void main(String[] args) {
        int arr [] = {5,4,1,3,2};
        Bsort(arr);

    }
}
