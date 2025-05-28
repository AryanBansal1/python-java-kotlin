package string;

public class stringCompression {

    // TIME COMPEXITY IS O(N) THOUGH IT MAY HAVE WHILE LOOP INSIDE FOR LOOP BUT THE LOOPS ARE RUNNING FOR ITH TIME AND I IS INCREMENT IN THE WHILE LOOP AS WELL

    public static void compression(String str){
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count ++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1)
            {sb.append(count.toString());}
            

        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        String abc = "aabbccccdddddee";
        compression(abc);
    }
}
