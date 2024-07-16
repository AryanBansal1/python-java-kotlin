package recursion;

public class binarystring {
    public static void main(String[] args) {
        binarystringprb(3, 0, "");
    }

    static void binarystringprb (int n , int lastplace, String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        if(lastplace==0){
            // if zero
            binarystringprb(n-1, 0, str+"0");
            // if one
            binarystringprb(n-1, 1, str+"1");
        }
        else{
            binarystringprb(n-1,0, str+"0");
        }
    }
}
