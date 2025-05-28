package Exception_Handling;
public class PrintError {
    public static void main(String[] args) {
        try{
            int a=100,b=0,c;
            c = a/b;
        }
        catch(ArithmeticException e){
            System.out.println(e);      // Exception name and description
            e.printStackTrace();        // this will print the exception name, description & stack trace    where stack trace inform about the line with the error
            System.out.println(e.getMessage());  //Only description
            
        }
    }
}
