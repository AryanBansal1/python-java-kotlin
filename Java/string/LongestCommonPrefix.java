package string;

public class LongestCommonPrefix {
    // in this we need to find the maximum character that are same in all the input from the start of the string . if start is not same then it is not prefix
    public static String longestCommPrefix(String str[]){
        String prefix = str[0];
        for(int i=1;i<str.length;i++){
            String curr = str[i];
            while(curr.indexOf(prefix)!=0){
                prefix = prefix.substring(0,prefix.length()-1);
            }
            if(prefix.isEmpty()){
                return "";
            }
        }
        return prefix;

    }

    public static void main(String args[]){
        String arr[] = {"flower","flow","flight"};
        System.out.println(longestCommPrefix(arr));
    }
}
