package array;

public class BuysellStock {

    public static void profit(int arr[]){
        int buy = Integer.MAX_VALUE;
        int maxprft=0;
        int profit;
        for(int i=0;i<arr.length;i++){
            int sell = arr[i];
            profit = sell-buy;
            maxprft = Math.max(maxprft, profit);
            if(arr[i]<buy){
                buy = arr[i];
            }
        }
        System.out.println(maxprft);
    }

    public static void main (String args[]){
        int price[] = {7,6,4,3,1};
        profit(price);
    }
}
