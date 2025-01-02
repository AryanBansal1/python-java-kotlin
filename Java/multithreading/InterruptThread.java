package multithreading;

public class InterruptThread extends Thread {
    
    public void run(){
        System.out.println(Thread.interrupted());   //It first print the wether the thread is interrupted or not and the change the status from true to false. Hence making it not interrupted 
        try{
            for(int i=0;i<=5;i++){
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
    public static void main(String[] args)throws InterruptedException {
        InterruptThread t1 = new InterruptThread();
        t1.start();
        t1.interrupt();

    }
}
