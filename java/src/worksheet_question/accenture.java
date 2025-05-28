import java.util.*;
public class accenture {

    public static boolean check(String a , int arr[]){
        for(int i=0;i<a.length();i++){
            if(arr[a.charAt(i)]==0){
                return false;
            }
            else{
                arr[a.charAt(i)]--;
            }
        }
        return true;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String ab = sc.nextLine();
        String arr[] = ab.split(" ");
        String a = arr[0];
        String b = arr[1];
        int chararr[] = new int[256];
        for(int i=0;i<b.length();i++){
            chararr[b.charAt(i)] ++;
        }
        boolean result = check(a,chararr);
        if(result){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}
