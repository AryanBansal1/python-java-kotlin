package OOPS;

public class keyStatic {
    public static void main(String[] args) {
        animal a1 = new animal();
        animal a2 = new animal();

        a1.name = "animal 1";
        a1.live = "they live happy";
        System.out.println(a2.live);
        animal a3 = new animal();
        a3.live = "they died long ago";
        System.out.println(a1.live);
    }
}

class animal{
    static String live;
    String name;
    
}
