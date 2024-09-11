package arrlist;

import java.util.ArrayList;

public class pairSum {

    public static void target_pairsum_bf(ArrayList<Integer> list, int target){
        // Brute Force O(n^2)
        int idx1=0;
        int idx2=0;
        System.out.print("The index are");
        for (int i=0;i<list.size();i++){
            for(int j=0;j<list.size();j++){
                if(i!=j){
                    int parisum = list.get(i)+list.get(j);
                    if(parisum==target){
                        idx1=i;
                        idx2=j;
                        System.out.print(" {"+idx1+","+idx2+ "}");
                    }
                }
            }
        }
       
    }

    public static void target_pairsum_2pt(ArrayList<Integer> list,int target){
        // Two pointer approach 0(n)
        int left_ptr =0;
        int right_ptr = list.size()-1;
        while(left_ptr<right_ptr){
            int sum = list.get(left_ptr) + list.get(right_ptr);
            if(sum == target){
                System.out.print("The index are {"+left_ptr + ","+right_ptr+"}" );
                return;
            }
            else if (sum>target){
                right_ptr--;
            }
            else{left_ptr++;
            }
        }
        

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        target_pairsum_bf(list, 5);
        System.out.println();
        target_pairsum_2pt(list,5);
    }
}
