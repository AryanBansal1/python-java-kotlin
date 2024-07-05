public class bitManupilation {

    public static void checkoddeven(int n){
        if((n & 1) ==1){
            System.out.println("the number "+ n + " is odd");
        
        }
        else {System.out.println("the number "+ n+" is even");}
    }

    public static void getithbit(int n , int i){
        int bitmask = 1<<i;
        if((n & bitmask)==0){
            System.out.println("0");
        }
        else{System.out.println("1");}
    }

    public static void setithbit(int n,int i){
        // THE ITH BIT SHOULD BE ONE
        int bitmask = 1<<i;
        System.out.println(n | bitmask);
    }

    public static void clearithbit(int n, int i){
        // THE ITH BIT SHOULD BE ZERO
        int bitmask = ~(1<<i);
        System.out.println(n & bitmask);
    }

    public static void updateithbit(int n , int i , int update){
        if(update ==0){
            clearithbit(n, i);
        }
        else if (update ==1){
            setithbit(n, i);
        }
    }


    public static void clearlastibits(int n, int i){
       int  bitmask = ((-1)<<i);
        System.out.println(n & bitmask);
    }

    public static void clearbitsrange(int n , int i , int j){
        int bitmask_a = ((-1)<<(j+1));
        int bitmask_b = (~((-1)<<i));
        int bitmask = (bitmask_a | bitmask_b);
        System.out.println(n & bitmask);
    }

    public static Boolean powerof2(int n){
        if((n & (n-1))==0){
            return true;
        } 
        else {return false;}
    }

    public static void countSetBit(int n){

        // no. of set bit = no. of ones digit
        int count=0;
        while(n>0){
            if((n & 1)==1){
                count +=1;
            }
            n=(n>>1);
        }
        System.out.println(count);
    }

    public static void fastExponentiation(int a,int n){

        //  A IS THE NUMBER AND N IS THE POWER 

        int ans =1;
        while(n>0){
            if((n & 1)==1){
                ans = ans*a; 
            }
            a = a*a;
            n = n>>1;
        }
        System.out.println(ans);
    }


    public static void main(String[] args) {
        //checkoddeven(8);
        //getithbit(11, 2);
        //setithbit(10, 2);
        //clearithbit(15,2);
        //updateithbit(10, 2, 1);
        //clearlastibits(15, 2);
        //clearbitsrange(10, 2, 4);
        //System.out.println(powerof2(32));
        //countSetBit(15);
        fastExponentiation(5, 3);
    }
}
