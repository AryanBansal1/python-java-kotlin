public class Callbyvalue {
        public static void main(String args []){
        //type conversion or widening
        int a = 8;

        // Call By Value
        System.out.println(a);
        multiply(a);
        System.out.println(a);

        // Call by Reference
        int arr[] = {5,7,8};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        multiply(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
    public static void multiply(int ace){
        ace = ace*5;
    }
    public static void multiply(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i]+=5;
        }
    }
}
