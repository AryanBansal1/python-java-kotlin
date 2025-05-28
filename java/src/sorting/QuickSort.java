package sorting;

public class QuickSort {
    public static void main(String[] args) {
        int array[] = {6,7,9,15,2,4,1};
        quicksort(array,0,array.length-1);
        for(int i=0;i<array.length;i++ ){
            System.err.println(array[i]);
        }

    }
    public static void quicksort(int arr[],int start,int end){
        if(start>=end){
            return ;
        }
        int pi = partition(arr, start,end);
        quicksort(arr, pi+1, end);
        quicksort(arr, start, pi-1);

    }
    public static int partition(int arr[],int start,int end){
        int pivot_index = start;
        int pivot = arr[pivot_index];
        while(start<end){
            while(start<end && arr[start]<=pivot){
                start++;
            }
            while(arr[end]>pivot){
                end--;
            }
            if(start<end){
                swap(arr, start, end);
            }

        }
        swap(arr, pivot_index, end);
        return end;
    }

    public static void swap(int arr[],int a ,int b){
        if(a!=b){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
    }
}
