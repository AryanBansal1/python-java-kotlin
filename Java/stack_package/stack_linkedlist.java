package stack_package;

public class stack_linkedlist {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data =data;
            this.next=null;
        }

    }
    public static Node head;
    public static Node tail;
    public static int size;
    public static class Stack{


        public static boolean isEmpty(){
            if(head==null){
                return true;
            }
            return false;
        }
        // push
        public static void push(int data){
            Node newNode = new Node(data);
            size++;
            if(head==null){
                head=tail=newNode;
                return;
            }
            newNode.next = head;
            head=newNode;

        }
        //pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            size--;
            return top;
        }
        // peek 
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }

    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(5);
        s.push(10);
        s.push(15);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
