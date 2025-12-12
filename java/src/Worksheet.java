import java.util.LinkedList;
public class Worksheet {
    public static void main (String args[]){
        LinkedList <Integer>arr = new LinkedList<>();
        arr.add(1);
        arr.add(2);
        arr.add(6);
        LinkedList<Integer> arr2 = new LinkedList<>();
        arr2.add(3);
        arr2.add(4);
        arr2.add(5);
      LinkedList <Integer>result = mergelist(arr,  arr2);
      for(int i=0;i<result.size();i++){
        System.out.println(result.get(i));
      }
    }

    public static LinkedList<Integer> mergelist(LinkedList <Integer>arr,LinkedList<Integer>arr2){
        LinkedList <Integer>ans= new LinkedList<>();
        int i=0;
        int j=0;
       while (i<=arr.size()-1 || j<=arr2.size()-1) {
        if(arr.get(i)<=arr2.get(j)){
            ans.add(arr.get(i));
            i++;
            continue;
        }
        if(arr.get(i)>arr2.get(j)){
            ans.add(arr2.get(j));
            j++;
            continue;
        }
        while(i<=arr.size()-1){
            ans.add(arr.get(i));
            i++;
        }
        while(j<=arr2.size()-1){
            ans.add(arr2.get(j));
            j++;
        }
       }
       return ans;
    }
}
