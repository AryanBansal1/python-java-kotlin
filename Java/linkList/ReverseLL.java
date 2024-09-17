package linkList;

public class ReverseLL {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next= null;
        }

    }
    public static Node head;
    public static Node tail;

    public void reverse(){
        Node prev =null;
        Node curr = head;
        Node next;
        while (curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr=next;
        }
        head = prev;

    }

    public void  addfirst(int data){
        Node newNode =new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void printll(){
        Node temp =head;
        while(temp!=null){
            System.out.print(temp.data+ " " );
            temp = temp.next;

        }
        System.out.println();
    }
    public static void main(String[] args) {
        ReverseLL ll = new ReverseLL();
        ll.addfirst(50);
        ll.addfirst(15);
        ll.addfirst(10);
        ll.addfirst(5);
        ll.printll();
        ll.reverse();
        ll.printll();
        
    }
}
