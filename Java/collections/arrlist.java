package collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class arrlist {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        ArrayList<Integer> int_arr = new ArrayList<>();
        ArrayList<String> string_arr = new ArrayList<>();        
        al.add(10);
        al.add(20);
        al.add("aryan");
        System.out.println(al);
        System.out.println(al.contains(20));

        ArrayList al2 = new ArrayList();
        al2.add("aaa");
        al2.add("bbb");
        // Add All
        al.addAll(al2);
        System.out.println(al);

        // Iterating over each element
        Iterator itr =  al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        // ListIterator 
        System.out.println("Using listiterator");
        ListIterator litr = al.listIterator();
        // first take the cursor to last
        litr.next();
        litr.next();
        litr.next();
        while(litr.hasPrevious()){
            System.out.println(litr.previous());
        }

        // GET AND SET
        al.set(2, "aryan bansal");
        System.out.println(al.get(2));

        // Clear 
        al.clear();
        System.out.println(al);


        
    }
}
