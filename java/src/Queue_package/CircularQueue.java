package Queue_package;

public class CircularQueue {
    public static void main(String[] args) {
        Queue q = new Queue(3); 
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.print();
    }
}

class Queue{
    int []arr;
    int size;
    int front=-1;
    int rear=-1;

    public Queue(int n){
        size = n;
        arr = new int[n];
    }

    public boolean isEmpty(){
        return (front==-1 && rear==-1);
    }

    public boolean isFull(){
        return ((rear+1)%size==front);
    }

    public void add (int data){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        // adding for the first time
        if(front==-1){
            front=0;
        }
        rear = (rear+1)%size;
        arr[rear]=data;
    }

    public void print(){
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
    }
}
