package Queue_package;
public class QueueThroughLL {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.add(76);
        q.add(54);
        q.add(43);
        System.out.println(q.peek());
    }
}

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data= data;
        this.next=null;
    }
}
class MyQueue{
    static Node head = null;
    static Node tail = null;

    public static boolean isEmpty(){
        return (head==null && tail==null);
    }

    public static void add(int data ){
        Node newNode = new Node(data);
        //if adding first time
        if(isEmpty()){
            head =newNode;
            tail=newNode;
            return;
        }
            tail.next = newNode;
            tail=newNode;
    }

    public static int remove(){
        if(isEmpty()){
            System.out.println("Node is already empty");
            return -1;
        }
        int temp = head.data;

        if (head==tail){
            head=tail=null; 
        } 
        else{
            head= head.next;
        }
        return temp;
    }
    public static int peek(){
        return head.data;
    }
}
