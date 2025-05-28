package recursion;

public class tilintProblem {
    public static void main(String[] args) {
        // TELL ME THE NUMBER OF WAYS U CAN FILL THE FLOOR(2XN) WITH TILES (2X1)
        System.out.println(tilingways(4));
    }


    static int tilingways(int n){
        // base case
        if(n==0 || n==1){
            return 1;
        }

        // if vertical (n-1)
        int verticaltiles = tilingways(n-1);
        // if Horizontal (n-2)
        int horizontaltiles  = tilingways(n-2);

        int totalways = verticaltiles + horizontaltiles;
        return totalways;

    }
}
