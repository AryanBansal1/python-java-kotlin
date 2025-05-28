public class arrayAssignment {
    // Question1
    public static Boolean distinctelement(int arr[]){
        Boolean flag = false;
        for(int i =0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return flag = true;
                }
            }
        }
        return flag;
    }


    public static void main(String[] args) {
        int nums[] = {1,2,3,1};
        //int nums[] = {1,2,3,4};
        //int nums[] = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(distinctelement(nums));
    }
}
