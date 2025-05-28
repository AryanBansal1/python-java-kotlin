package recursion;

public class XToPowerN {
    public static void main(String[] args) {
       System.out.println(optimizedPower(2, 8));
        
    }

    static int power(int x , int n){
        if(n==0){
            return 1;
        }
        return x * power(x, n-1);
    }

    // MORE OPTIMISED 
    static int optimizedPower(int x , int n){ // O(LogN)
        if(n==0){
            return 1;
        }
        int halfpower = optimizedPower(x, n/2);
        int halfpowersq = halfpower* halfpower;        
        // n is odd
        if(n%2 !=0){
            halfpowersq = x* halfpowersq;
        }

        return halfpowersq;
    }
}
