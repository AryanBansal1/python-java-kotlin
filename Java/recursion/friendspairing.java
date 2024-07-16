package recursion;

public class friendspairing {
    public static void main(String[] args) {
       System.out.println( friendspair(3));
    }

    static int friendspair(int n ){
        if(n==1 || n==2){
            return n;
        }

        // standing alone
        //int way1 = freindspair(n-1);

        // stading in pair
        //int way2 = (n-1) * freindspair(n-2);
        //return int totalways = way1 + way2;

        return friendspair(n-1) + ((n-1)*friendspair(n-2));

    }
}