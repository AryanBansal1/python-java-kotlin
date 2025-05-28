package sorting;

public class SelectionSort {
    public static void SelectSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minimum_value= i;
            for(int j=i+1;j<arr.length;j++){
                if (arr[minimum_value]>arr[j]){
                    minimum_value=j;
                }
            }
            //swap
            GeneralFunction.swap(arr, i,minimum_value);
        }  
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }


    public static void main(String[] args) {
            int arr []= {5,4,1,3,2};
            SelectSort(arr);
    }
}
