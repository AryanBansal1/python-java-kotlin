public class palindrome {
    // THESE ARE THOSE NUMBER WHOSE REVERSE IS EQUAL TO THE SAME NUMBER
    public static Boolean pdrome(int a ){
        int initalnumber = a ;
        int reversenumber = 0;
        while(a>0){
            int lastdigit = a%10;
            reversenumber = (reversenumber*10)+lastdigit;
            a/=10;
        }
        if (initalnumber == reversenumber){return true;}
        else{return false;}
    }


    public static void main(String[] args) {
        System.out.println(pdrome(421));
    }
}
