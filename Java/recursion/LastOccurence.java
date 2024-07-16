package recursion;

public class LastOccurence {
    public static void main(String[] args) {
        int array1[] = {8,3,9,6,5,10,5,2,3};
        System.out.println(occuredlast(array1, 0, 5));
    }

    static int occuredlast(int arr[],int i,int key){
        if(i == arr.length){
            return -1;
        }

        int isfound = occuredlast(arr, i+1, key);
        if(isfound==-1 && arr[i]==key){
            return i;
        }
        return isfound;
    }
}
