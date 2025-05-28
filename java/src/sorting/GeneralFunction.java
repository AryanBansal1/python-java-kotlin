package sorting;

public class GeneralFunction {

    public static void swap(int arr[],int a,int b){
        if(a !=b){
            int temp = arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
        }
    }

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.err.print(arr[i]+" ");
        }
    }
}
