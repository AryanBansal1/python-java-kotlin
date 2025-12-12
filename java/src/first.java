public class first {
  public static void main(String[] args) {
    System.out.println("raj");
    System.out.println("kat");
    //the print method does not insert new line 
    System.out.print("jazz");
    System.out.println("dash");
    System.out.println(5*6);
    //java by default consider long as int so use L and likewise it consider float as double so use F 
    float z = 3.8F;
    double k = 3.9;
    System.out.println(z);
    System.out.println(k);
    //String with three inverted Commas
    String family = """
        Alka
        Naveen
        Aryan
        Akshay
        """;
    System.out.println(family);
    //Typecasting 
    //smaller to larger
    float t = 3.8F;
    double d = t;
    System.out.println(d);
    //large to smaller
    int i =7000;
    byte p = (byte)i;
    //converting large to smaller value could be incorrect 
    System.out.println(p);

    String kit = "Aryan";
    String j = "Aryan";
  }
    
}