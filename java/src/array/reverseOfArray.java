public class reverseOfArray {

    public static void swap(int arr[],int a ,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b]=temp;
    }

    public static void reverse(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[]={1,3,5,7,9,12,35,67,90};
        reverse(arr);
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        };
    }
}
