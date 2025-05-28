package arrlist;

import java.util.ArrayList;

public class pairSum_Rev_sorted_arr {

    public static void pairsum_rev_arr(ArrayList<Integer> list,int target){
        // Time complexity turns out to be O (n)
        int pivot_idx=0;
       for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                pivot_idx = i;
                break;
            }
       }
       int smallest = pivot_idx+1;
       int sum =0;
       int n = list.size();
       while(smallest !=pivot_idx){
            sum = list.get(smallest)+ list.get(pivot_idx);
            System.out.println(sum);
            if(sum==target){
                System.out.println(smallest + ","+ pivot_idx);
                return;
            }
            else if(sum>target) {
                pivot_idx = (n + pivot_idx-1)%n;

            }
            else{
                smallest = (smallest+1)%n;
            }
       }
       System.out.println("does not exist");

    }

    public static void main(String[] args) {
         ArrayList<Integer> list = new ArrayList<>();
         list.add(11);
         list.add(15);
         list.add(6);
         list.add(8);
         list.add(9);
         list.add(10);
         pairsum_rev_arr(list,26);
         
    }
}
