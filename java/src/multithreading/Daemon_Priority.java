package multithreading;

public class Daemon_Priority extends Thread {
    // these Threads execute in the background
    public void run(){
        System.out.println("Daemon thread");
        System.out.println(Thread.currentThread().getPriority());
    } 

    public static void main(String[] args) {
        System.out.println("Main thread working");
        System.out.println(Thread.currentThread().getPriority());
        Daemon_Priority t = new Daemon_Priority();
        t.setDaemon(true);  // Thread will be executed in the background as long as main thread is running and only if main thread has some work .
        t.setPriority(10);
        t.start();
        System.out.println("Main thread continues");
        
    }
}
