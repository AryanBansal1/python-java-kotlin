package array;

public class reverseofarr {
    public static void main(String[] args) {
        int arr[]= {1,3,5,7,9,6};
        revarr(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    static int[] revarr(int arr[]){
        for(int i=0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        return arr;
    }
}
