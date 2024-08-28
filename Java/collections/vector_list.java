package collections;

import java.util.Vector;

public class vector_list {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.addElement("ram");
        v.add(354);
        System.out.println(v.capacity());
        System.out.println(v);
    }
}
