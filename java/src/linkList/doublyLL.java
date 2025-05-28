package linkList;

public class doublyLL {

    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next =null;
            this.prev = null; 
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addfirst(int data){
        Node newnode = new Node(data);
        size++;
        if (head ==null){
            head=tail=newnode;
            return;
        }
        newnode.next = head;
        head.prev = newnode;
        head = newnode;
    }

    public void addlast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;

    }

    public void removelast(){
        if(head.next==null){
            head=tail=null;
            size--;
            return;
        }
        tail = tail.prev;
        tail.next=null;
        size--;
    }
    public void removeFirst(){
        if(head==null){
            return;
        }
        if(head.next==null){
            head=tail=null;
            size--;
            return;
        }
        head=head.next;
        head.prev=null;
        size--;

    }

    public void reverseDLL(){
        Node curr=head;
        Node previous=null;
        Node next;
        tail=head;
        while(curr!=null){
            next = curr.next;
            curr.next = previous;
            curr.prev=next;
            previous=curr;
            curr=next;
        }
        head = previous;
    }
    
    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void print_rev(){
        Node temp = tail;
        while(temp!=null){
            System.out.print(temp.data+ " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        doublyLL ll = new doublyLL();
        ll.addfirst(188);
        ll.addfirst(31);
        ll.addfirst(9);
        ll.addfirst(7);
        ll.addfirst(2);
        ll.removelast();
        ll.removeFirst();
        ll.addlast(69);
        ll.print();
        ll.print_rev();
        ll.reverseDLL();
        ll.print();
        ll.print_rev();
        System.out.println(ll.size);
    }
}
