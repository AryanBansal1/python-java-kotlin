package multithreading;

public class MultiTask_MultiThread extends Thread {
    
    // Single task through Multi-Thread
    public void run(){
        System.out.println("Task executing");
    }

    public static void main(String[] args) {
        MultiTask_MultiThread t1 = new MultiTask_MultiThread();
        MultiTask_MultiThread t2 = new MultiTask_MultiThread();
        t1.start();                 // Thread 1
        t2.start();                 // Thread 2 doing same task
    }


}
