import java.util.Scanner;
import java.util.*;
public class practice {

    public static void main(String[] args) {
        System.out.println(maximumSwap(71393));
    }

    public static int maximumSwap(int num){
        char digit[] = String.valueOf(num).toCharArray();
        int last[] = new int[10];
        for(int i=0;i<digit.length;i++){
            last[digit[i]-'0'] =i;
        }

        for(int i=0;i<digit.length;i++){
            for(int d=9;d>digit[i]-'0';d--){
                if(last[d]>i){
                    char temp = digit[i];
                    digit[i] = digit[last[d]];
                    digit[last[d]] = temp;
                    return Integer.parseInt(new String(digit));
                }
            }
        }
        return num;
    }
    }

