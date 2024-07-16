package recursion;

public class removeduplicate {
    // TO REMOVE DUPLCATE IN A STRING
    public static void main(String[] args) {
        String xyz = "hellooworld";
        // output should be = "helowrd"
        duplicacyremoval(xyz,0,new StringBuilder(""),new boolean[25]);
    }

    static void duplicacyremoval(String abc, int i, StringBuilder newstring, boolean map[] ){
       
        if(i==abc.length()){
            System.out.println(newstring);
            return;
        }

        int index = abc.charAt(i) - 'a';
        if(map[index]==false){
            map[index] = true;
            newstring.append(abc.charAt(i));
            duplicacyremoval(abc, i+1, newstring, map);
        }
        else{
            duplicacyremoval(abc, i+1, newstring, map);
        }

    }
}
