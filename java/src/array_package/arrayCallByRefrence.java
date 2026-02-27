package array_package;
public class arrayCallByRefrence {

    // Showing how the array are based on Call By Refrence , meaning original array changes when passed as argument in function 
    public static void update(int a[]){
        //updating array 
        for(int i = 0; i<a.length;i++){
            a[i]= a[i]+1;
        }
    }



    public static void main(String[] args) {
       int score[] = {88,56,93};
       // Calling fun to update array
       update(score);

       //Printing the elements of array
       for (int i = 0;i<score.length;i++){
         System.out.print(score[i]+" ");
       }
         
    }
}
