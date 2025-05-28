package array;

public class reverseSortedarr {
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,15,18,19};
        int arrrev[] = {8,15,18,19,2,4,6};
        
        int target = 15;
        //System.out.println(bsearch(arr, target));
        System.out.println(BSRevSortedArr(arrrev,target));
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

    public static int BSRevSortedArr(int arr[],int target){
        int starting_indx = 0;
        int ending_indx = arr.length-1;
        while(starting_indx<=ending_indx){
            int mid = (starting_indx+ending_indx)/2;
            if(target == arr[mid]){
                return mid;
            }
            if(arr[starting_indx]<=arr[mid]){
                if(arr[starting_indx]<=target && arr[mid]>target){
                    ending_indx = mid-1;
                }
                else{
                    starting_indx = mid+1;
                }
            }
            else{
                if(arr[mid+1]<=target && arr[ending_indx]>=target){
                    starting_indx = mid+1;
                }
                else{
                    ending_indx = mid-1;
                }
            }


        }
        return -1;
    }
}
