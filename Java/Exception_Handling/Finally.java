package Exception_Handling;

public class Finally {
    public static void main(String[] args) {
        try{
            int a=100,b=0,c;
            c=a/b;
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Hello Wolrd");
        }
        System.out.println("Hello Wolrd");

    }
}
