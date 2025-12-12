package array;

public class SumSubArr {
    public static void main(String[] args) {
        int arr[] = {1,-2,4,5,-5,7 };
        System.out.println(MaxSubArr(arr));

    }

    static int MaxSubArr(int arr[]){
        int currentSum=0;
        int maxsum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            currentSum +=arr[i];
            maxsum = Math.max(maxsum, currentSum);
            if(currentSum<0){
                currentSum=0;
            }
        }
        return maxsum;
    }
}
