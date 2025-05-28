package sorting;
import java.util.Arrays;
import java.util.Collections;
public class InBuiltSort {
    public static void main(String[] args) {
        
        int arr[] = {5,3,2,4,1};

        //Basic Sort
            //Arrays.sort(arr);
            //GeneralFunction.printArray(arr);
        //Idexing Sort
            // Arrays.sort(arr,0,3);
            // GeneralFunction.printArray(arr);
        //Reverse Order
            // Work on Integer type not on int
            Integer arr1[] = {4,2,6,1,7,0};
            Arrays.sort(arr1,Collections.reverseOrder(null));
            
    }

}
