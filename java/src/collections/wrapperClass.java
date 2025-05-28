package collections;

public class wrapperClass {
    public static void main(String[] args) {
        Integer n =25;
        System.out.println(n);

        // converting object into primitive type
        int k = n;
        // or
        int k2 = n.intValue();
        System.out.println(k + k2);

        // Converting primitive datatype to object
        Integer n2 = k;    
        System.out.println(n2);
    }
}
