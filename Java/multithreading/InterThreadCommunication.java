package multithreading;

public class InterThreadCommunication extends Thread {

    static int totalearning=0;
    public void run (){
        synchronized(this){
            for(int i=0;i<10;i++){
                totalearning +=100;
            }
            this.notify();
        }
        
  
    }

    public static void main(String[] args) throws InterruptedException{
        InterThreadCommunication com = new InterThreadCommunication();
        com.start();
        synchronized(com){
            com.wait();
            System.out.println("total earning are "+ totalearning);    
        }
        
    }
}

