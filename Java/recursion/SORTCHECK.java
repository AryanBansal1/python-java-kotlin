package recursion;

public class SORTCHECK {
    public static void main(String[] args) {
        int numarray[]= {2,3,5,6,1};
        System.out.println(checksort(numarray,0));
    }

    // TIME COMPLEXITY AND SPACE COMPLEXITY = O(N)
    static Boolean checksort(int arr[], int i){
        // I is the starting index
        if(i == (arr.length-1)){
            return true;
        }
        else if (arr[i] > arr[i+1])
            {
                return false;
            }
        
        else{return checksort(arr, i+1);}
    }
    
}
