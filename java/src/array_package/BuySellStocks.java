package array_package;
import java.util.*;
public class BuySellStocks {

    //By Myself

    // public static void buySell(int arr[]){
    //     int maxprofit =0;
    //     int minBuyprice = Integer.MAX_VALUE;
    //     for(int i=0;i<arr.length-1;i++){
    //         // FOR BUY PRICE
    //             minBuyprice=Math.min(minBuyprice,arr[i]);
            
    //         //Selling price
    //         int sellingprice = arr[i+1];
    //         //profit
    //         int profit = sellingprice-minBuyprice;
    //         maxprofit= Math.max(maxprofit,profit);
            

    //     }
    //     System.out.println("Maximum profit is the "+maxprofit);
    // }


    //By Shardha di
    public static void buySell(int arr[]){
        int maxprofit =0;
        int minBuyprice = Integer.MAX_VALUE;
        
        for(int i=0;i<arr.length;i++){
            int sellingPrice = arr[i];
            if(minBuyprice<sellingPrice){
                int profit = sellingPrice-minBuyprice; 
                maxprofit = Math.max(maxprofit, profit);
            }
            else{minBuyprice=arr[i];}
            
    
        }
        System.out.println("Maximum profit is the "+maxprofit);
    }

     
    public static void main(String[] args) {
        int price []= {7,1,5,3,6,4};
        buySell(price);
    }
}
