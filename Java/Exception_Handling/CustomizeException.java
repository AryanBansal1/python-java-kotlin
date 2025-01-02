package Exception_Handling;

class AgeNotEligible extends Exception{ //This will create Checked or Compile Exception But if you extends RuntimeException it will create unchecked exception
    AgeNotEligible(){
        super("You are not under the age bracket");
    }

    AgeNotEligible(String message){
        super(message);
    }
}

public class CustomizeException {
    public static void main(String[] args) {
     int age =14;
     if(age<18){
        try{
            throw new AgeNotEligible();
        }
        catch(AgeNotEligible e){
            e.printStackTrace();
        }
     }
     else{
        System.out.println("You have voted ");
     }
     System.out.println("Your code is good if you are able to reach here");   
    }
}
