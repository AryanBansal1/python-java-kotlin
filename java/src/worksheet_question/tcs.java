public class tcs {

    public static void secondSmLar(int arr[]){
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int secondsmallest=Integer.MAX_VALUE;
        int secondlargest= Integer.MIN_VALUE;
        int n=0;
        while(n<2){
            for(int i=0;i<arr.length;i++){
                if(arr[i]>largest){
                    largest = arr[i];
                }
                if(arr[i]<smallest){
                    smallest = arr[i];
                }
            }
            n++;
        }
        System.out.println(largest + " "+smallest);

    }

    public static void main(String[] args) {
        int arr[] = {3,6,1,4,8,2};
        secondSmLar(arr);
    }
}
