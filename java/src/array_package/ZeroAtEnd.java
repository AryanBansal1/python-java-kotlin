package array_package;
public class ZeroAtEnd {
    public static void main(String[] args) {
        int arr[] = {0,1,2,0,5};
        int arr2[]=shiftzero(arr);
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }

    }
    public static int[] shiftzero(int array[]){
        int index = 0;
        for(int i=0;i<array.length;i++){
            if(array[i]!=0){
                array[index++] = array[i];  // We have used Post Incrementation 
            }
        }
        while (index<array.length) {
            array[index] = 0;
            index++;
        }
        return array;
    }
}
