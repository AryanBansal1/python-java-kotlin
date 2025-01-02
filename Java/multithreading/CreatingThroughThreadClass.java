package multithreading;

public class CreatingThroughThreadClass extends Thread {
    public void run(){
        //task of the thread
    }
    public static void main(String[] args) {
        CreatingThroughThreadClass t = new CreatingThroughThreadClass();
        t.start();      //It creates a callstack for thread
    }
}
