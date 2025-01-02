package multithreading;

public class NamingMethod extends Thread {

    public void run(){
        Thread.currentThread().setName("Thread6");
        System.out.println("thread is executed "+ Thread.currentThread().getName() );
    }
    public static void main(String[] args) {
        // System.out.println("hello");
        // //NamingMethod t1 = new NamingMethod();
        // System.out.println(Thread.currentThread().getName());

        // //System.out.println(10/0);
        // //Thread.currentThread().setName("Major");
        // //System.out.println(10/0);       // It will give exception in thread major 

        NamingMethod t = new NamingMethod();
        t.start();
        t.setName("thread 1");
        System.out.println(t.getName());

    }
}
