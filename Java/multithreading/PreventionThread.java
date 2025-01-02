package multithreading;

public class PreventionThread extends Thread {
     static Thread mainthread;

    public void run(){
        for(int i=0;i<5;i++){
            try{
                mainthread.join();  // IT will make sure first main thread is executed and then other thread join 
                Thread.sleep(1000);
            }
            catch(Exception e ){
                System.out.println(e);
            }
            
            System.out.println(i);
        }
    }

    public static void main(String[] args) throws InterruptedException{
        PreventionThread t1 = new PreventionThread();
        t1.start();
         mainthread = Thread.currentThread();
        for(int i='a';i<'f';i++){
            Thread.sleep(1000);
            //Thread.yield();
            System.out.println((char)i);
            //t1.join();  //first main thread will let the execution of t1 thread and then will execute the main thread
        }
        System.out.println();

        PreventionThread t2 = new PreventionThread();
        t2.start();
    }
}
