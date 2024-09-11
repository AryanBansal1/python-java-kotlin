package arrlist;

import java.util.ArrayList;

public class Twodarray {
    public static void main(String[] args) {
        // defining 2darraylist
        ArrayList<ArrayList<Integer>> list= new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(4);
        list1.add(7);
        ArrayList <Integer> list2 = new ArrayList<>();
        list2.add(84);
        list2.add(54);
        list2.add(14);
        list2.add(64);
        list.add(list1);
        list.add(list2);
        System.out.println(list);

        // Traversing to each element
        for(int i=0;i<list.size();i++){
            ArrayList<Integer> currList = list.get(i);
            for(int j=0;j<currList.size();j++){
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }
    }
}
