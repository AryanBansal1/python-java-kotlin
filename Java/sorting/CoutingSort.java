package sorting;

public class CoutingSort {

    public static void CountSort(int arr[]){
        // Finding the max number as that would be the size of frequency arr
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest = Math.max(largest, arr[i]);
        }

        // Auxiliary array
        int frequency[]=new int[largest+1];
        // This would add 1  to the element as index of frequency array 
        for(int i=0;i<arr.length;i++){
            frequency[arr[i]]++;
        }
        
        // Sorted array
        int j=0;
        for(int i=0;i<frequency.length;i++){
            while(frequency[i]>0){
                arr[j]=i;
                j++;
                frequency[i]--;
            }
        }
    }


    public static void main(String[] args) {
        int arr []={1,4,1,3,2,4,3,7};
        CountSort(arr);
        GeneralFunction.printArray(arr);
    }
}
