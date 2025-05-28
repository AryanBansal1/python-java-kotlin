import java.util.Scanner;
public class validpalindromeString {

    public static boolean isPalindrome(String s){
        int start = 0;
        int end = s.length()-1;
        while(start<end){
            char strtChr = s.charAt(start);
            char endChr = s.charAt(end);
            if(!Character.isLetterOrDigit(strtChr)){
                start++;
            }
            else if(!Character.isLetterOrDigit(endChr)){
                end--;
            }
            else{
                if(Character.toLowerCase(s.charAt(start))!= Character.toLowerCase(s.charAt(end))){
                    return false;
                }
            
                start++;
                end--;
            }
        }
        return true;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isPalindrome(s));
    }
}
