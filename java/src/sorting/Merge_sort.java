package sorting;

public class Merge_sort {
    public static void main(String[] args) {
        int arr[] = {5,7,2,9,1,15,4,-4};
        MergeSort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);    
        }
    }
    public static void MergeSort(int array[],int start,int end){
        int mid = (start+end)/2;
        if(end<=start){
            return;
        }
        MergeSort(array, start, mid);
        MergeSort(array, mid+1,end);
        conquer(array,start,end,mid);
        
    } 
    public static void conquer(int arr[],int start,int end,int mid){
        int temp[] = new int[end-start+1];
        int i =start; //idx for left array
        int j = mid+1; // idx for right array
        int k = 0; //idx for temp
        while(i<=mid && j <=end){
            if(arr[i]<arr[j]){
            temp[k] = arr[i];
            i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        // if element left in left array
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        //if element are left in right array
        while(j<=end){
            temp[k++]= arr[j++];
        }

        // now to copy the temp array to original array
        for( i=start,k=0;k<temp.length;k++,i++ ){
            arr[i] = temp[k];
        }
    }
}
