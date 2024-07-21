package array;

public class reverseSortedarr {
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,15,18,19};
        int target = 19;
        System.out.println(bsearch(arr, target));
    }

    public static int bsearch(int arr[],int tar){
        int start_index = 0;
        int ending_index = arr.length-1;
        while(start_index<=ending_index){
            int mid = (start_index+ending_index)/2;
            if(arr[mid]>tar){
                ending_index = mid-1;
            }
            else if(arr[mid]==tar){
                return mid;
            }
            else{
                start_index = mid+1;
            }
        }
        return -1;
    }
}
