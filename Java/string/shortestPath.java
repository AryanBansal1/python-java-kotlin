import java.util.*;
public class shortestPath {

    /*
    North -> y+1
    south -> y-1
    west -> x-1
    east -> x+1
    */

    public static void shPath(String abc){
        int x = 0;
        int y=0;
        for(int i=0;i<abc.length();i++){
            if(abc.charAt(i)=='N'){
                y+=1;
            }
            else if (abc.charAt(i)=='S'){
                y-=1;
            }
            else if(abc.charAt(i)=='E'){
                x+=1;
            }
            else{
                x-=1;
            }
        }
        double result = Math.sqrt( (x*x) + (y*y));
        System.out.println(result);
    }

    public static void main (String args []){
        shPath("NS");
    }
}
