package string;

import java.util.HashSet;
import java.util.Set;

public class LongestDistinctSubSrting {

    public static void longestSubstring(String s){
        int left =0;
        int maxlength=0;
        Set<Character> set = new HashSet<Character>();
        for(int right=0;right<s.length();right++){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                maxlength = Math.max(maxlength, right-left+1);
            }
            else{
                while(set.contains(s.charAt(right))){
                    set.remove(s.charAt(left));
                    left++;
                }
                set.add(s.charAt(right));
            }
        }
        System.out.println(maxlength);
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        longestSubstring(s);
    }
}
