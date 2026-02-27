package Hashing_package;

import java.util.HashMap;
import java.util.Set;

public class ValidAnagram {
    public static void main(String[] args) {
        String a = "race";
        String b = "care";
        System.out.println(checkAnagramWithArray(a, b));
        System.out.println(checkAnagramWithMap(a, b));
    }

    public static boolean checkAnagramWithArray(String a , String b){
        int chars[] = new int[26];
        for(int i=0;i<a.length();i++){
            char one = a.charAt(i);
            chars[one-'a'] ++;
        }
        for(int i=0;i<b.length();i++){
            char two = b.charAt(i);
            chars[two-'a']--;
        }
        for(int i :chars){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
    public static boolean checkAnagramWithMap(String a , String b){
        HashMap<Character,Integer> map = new HashMap<>();
        if(a.length()!=b.length()){
            return false;
        }
        for(int i=0;i<a.length();i++){
            map.put(a.charAt(i), map.getOrDefault(a.charAt(i),0)+1);
            map.put(b.charAt(i), map.getOrDefault(b.charAt(i),0)-1);
        }
        for(int i : map.values()){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}
