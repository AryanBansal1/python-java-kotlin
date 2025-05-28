package multithreading;


 class MovieSeat{
    int totalseats=10;
    // this is synchronized method
    public synchronized void bookseat(int seat){
        if(totalseats>=seat){
            totalseats-=seat;
            System.out.println("Seats book successfully and remaining seats are "+ totalseats);
        }
        else{
            System.out.println("cant book as seat available are "+ totalseats);
        }
    }
    // this is synchroized block
    // public void bookseat(int seat){
    //    System.out.println();
    //    System.out.println();

    //     synchronized(this){
    //         if(totalseats>=seat){
    //             totalseats-=seat;
    //             System.out.println("Seats book successfully and remaining seats are "+ totalseats);
    //         }
    //         else{
    //             System.out.println("cant book as seat available are "+ totalseats);
    //         }
    // //     }

    //    System.out.println();
    //    System.out.println();
    //    System.out.println();

    // }

    // Static scynchronization 
    // public static synchronized void bookseat(int seat){
    //     if(totalseats>=seat){
    //         totalseats-=seat;
    //         System.out.println("Seats book successfully and remaining seats are "+ totalseats);
    //     }
    //     else{
    //         System.out.println("cant book as seat available are "+ totalseats);
    //     }
    // }
}

public class BookingSeat extends Thread {
    static MovieSeat movieSeat;
    int seat;
    public void run(){
        movieSeat.bookseat(seat);
    }

    public static void main(String[] args) {
        movieSeat = new MovieSeat();
        BookingSeat aryan = new BookingSeat();
        aryan.seat=6;
        aryan.start();
        BookingSeat ram = new BookingSeat();
        ram.seat=7;
        ram.start();
    }
}
