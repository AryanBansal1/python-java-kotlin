package sorting;
//  FOR DRY RUN  https://youtu.be/rrfRRllt4c4?si=BCKpvQDQSBgwVrKh
public class InsertionSort {

    public static void InsertSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            //Since the last value of j will be -1 everytime after the while loop
            arr[j+1] = key;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr [] = {5,4,1,3,2};
        InsertSort(arr);

    }
}
