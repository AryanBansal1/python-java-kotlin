package multithreading;

public class CreatingThroughRunnable implements Runnable {

    public void run() {
        // Task
    }

    public static void main(String[] args) {
        CreatingThroughRunnable fun = new CreatingThroughRunnable();
        Thread t = new Thread(fun);
        t.start();
    }
    
}
