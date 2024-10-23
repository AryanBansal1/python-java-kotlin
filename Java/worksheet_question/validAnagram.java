import java.util.Arrays;
import java.util.Scanner;

public class validAnagram {

    public static boolean checkAnagram(String s , String t){
        // time Complexity O(nlogn)
        char sArr[] = s.toCharArray();
        char tArr[] = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        return Arrays.equals(sArr, tArr);
    }
    public static boolean optimisedcheckAnagram(String s , String t){
        // time complexity o(n)
        if(s.length()!= t.length()){
            return false;
        }
        int freq[] = new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string s");
        String s = sc.nextLine();
        System.out.println("enter string t");
        String t = sc.nextLine();
        System.out.println(optimisedcheckAnagram(s, t));
        
    }
}
