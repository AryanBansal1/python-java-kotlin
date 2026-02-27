package Hashing_package;
import java.util.HashMap;
import java.util.Set;
public class IterationHashMap {
    public static void main(String[] args) {
        HashMap<String ,Integer> hp = new HashMap<>();
        hp.put("english", 80);
        hp.put("maths", 34);
        hp.put("science", 22);
        

        // hp.keySet() stores all the keys in a set
        Set <String> keys = hp.keySet();
        for(String key : keys){
            System.out.println(hp.get(key));
        }

    }
}
