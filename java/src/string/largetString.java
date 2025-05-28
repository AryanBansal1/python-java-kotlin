package string;

public class largetString {
    //public static void
    public static void main (String args[]){

        String fruits[] = {"apple","Orange","organic"};
        String largest = fruits[0];
        for(int i=1;i<fruits.length;i++){
            if(largest.compareToIgnoreCase(fruits[i])<0){
                largest = fruits[i];
            }
        } 
        System.out.println(largest);
        
    }
}
