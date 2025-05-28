package string;

import java.util.Scanner;

public class LongestRepeatingCharacter {
    // in this we have to find the maximum length of repeating character possible while doing k replacement . There is no need to acutally replace it , you just need to find the maximum number
    public static int longestRepeatingChr(String s,int k){
        int maxlength=0;
        int start=0;
        int maxOccurence=0;
        int arr[] = new int[26];
        for(int current=0;current<s.length();current++){
            arr[s.charAt(current)-'A']++;

            // track maximum occurence of a character
            maxOccurence = Math.max(maxOccurence, arr[s.charAt(current)-'A']);

            // track current window size
            int windowsize = current-start+1;

            // check if the windowsize is valid
            if(windowsize-maxOccurence>k){
                arr[s.charAt(start)-'A']--;
                start ++;
            }
            // track maxlength
            maxlength = Math.max(maxlength, current-start+1);
        }
        return maxlength;
    }

    public static void main(String[] args) {
        System.out.println('B'-'A');
        System.out.println(longestRepeatingChr("AABABBA", 1));
    }
}
