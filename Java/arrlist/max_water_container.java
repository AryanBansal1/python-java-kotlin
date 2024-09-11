package arrlist;

import java.util.ArrayList;

public class max_water_container {

    public static void most_water_container_bruteForce(ArrayList<Integer> list){
       // Solving thru Brute Force   O(n^2)
        int maxwater = Integer.MIN_VALUE;
        int strtidx=0;
        int lastidx=0;
        for(int i=0;i<list.size();i++){
            for(int j =i+1;j<list.size();j++){
                int hgt = Math.min(list.get(i), list.get(j));
                int width = j-i;
                int water = hgt*width;
                if(water>maxwater){
                    maxwater=water;
                    strtidx=i;
                    lastidx=j;
                }

            }
        }
        System.out.println("Start from "+strtidx+" till "+lastidx+" with the amount of water "+maxwater);
    }
    public static void most_water_container_2_ptr(ArrayList<Integer> list){
        // Solving Thru 2 Pointer Approach  O(n)
        int left_pt = 0;
        int right_pt = list.size()-1;
        int maxwater = 0;
        int lastidx=0 , strtidx =0;
        while(left_pt<right_pt){
            int height = Math.min(list.get(right_pt),list.get(left_pt));
            int width = right_pt-left_pt;
            int currwater = height* width;
            if(currwater>maxwater){
                maxwater = currwater;
                strtidx=left_pt;
                lastidx=right_pt;
            }
            if(left_pt<right_pt){
                left_pt++;
            }
            else{right_pt--;}
        }

        
        System.out.println("Start from "+strtidx+" till "+lastidx+" with the amount of water "+maxwater);
    }

    public static void main(String[] args) {
       ArrayList<Integer> heights = new ArrayList<>();
       heights.add(1);
       heights.add(8);
       heights.add(6);
       heights.add(2);
       heights.add(5);
       heights.add(4);
       heights.add(8);
       heights.add(3);
       heights.add(7); 
       System.out.println(heights);
       most_water_container_bruteForce(heights);
       most_water_container_2_ptr(heights);
    }
}
