package Queue_package;

public class QueueThroughArray {
    public static void main(String[] args) {
        MyQueue q = new MyQueue(3);
        q.add(32);
        q.add(12);
        q.add(17);
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
}

class MyQueue{
    static int arr[];
    static int size;
    static int rear;
    public  MyQueue(int n){
        arr = new int[n];
        size = n;
        rear =-1;
    }

    public static boolean isEmpty(){
        return rear ==-1;
    }
    public static void add (int data){
        if(rear==size-1){
            System.out.println("queue is full");
            return;
        }
        rear=rear+1;
        arr[rear] = data;
    }
    public static int remove(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int front =arr[0];
        for(int i=0;i<rear;i++){
            arr[i]= arr[i+1];
        }
        rear = rear-1;
        return front;
    }
    public static int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        return arr[0];
    }
}
