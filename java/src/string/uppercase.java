package string;

public class uppercase {

    public static void upperletter(String abc){
        StringBuilder sb = new StringBuilder("");
        sb.append(Character.toUpperCase(abc.charAt(0))) ;
        for(int i=1;i<abc.length();i++){
            if(abc.charAt(i) == ' ' && i<abc.length()-1){
                sb.append(" "); 
               sb.append(Character.toUpperCase(abc.charAt(i+1))) ;
               i++;
            }
            else{sb.append(abc.charAt(i));}
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        String line = "oo raja ji oo raja ji ";
        upperletter(line);
    }
}
