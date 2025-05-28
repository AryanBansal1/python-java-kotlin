package recursion;

public class FirstOccurence {
    public static void main(String[] args) {
        int arr[] = {8,3,9,6,5,10,2,5,3};
        occuredFirst(arr,0,5);
    }
    // time complexity and space complexity = O(N)
    static Boolean occuredFirst(int arr[],int i,int key){
        if(i == arr.length-1){
            System.out.println("element not present");
            return false;
        }
        if(arr[i] == key ){
            System.out.println(i);
            return true;
        }
        return occuredFirst(arr, i+1, key);
    }
}
