package strings;

public class palindrome {
    
    // which are same if started from start or end
    // racecar noon madam are examples

    public static Boolean palindromeTest(String str){
        //int i,j;
        //while (i<j){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    
    public static void main (String args []){
        System.out.println(palindromeTest("madam"));
    }
}
