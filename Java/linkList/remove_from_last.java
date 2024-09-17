package linkList;

public class remove_from_last {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next=null;
        }
    }
    public static Node tail;
    public static Node head;
    public static int Size;

    public void addfirst(int data){
        Node newNode = new Node(data);
        Size ++;

        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void printll(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
            
        }
        System.out.println();
    }
    public void rem_from_last(int lkey){
        // lkey is the key from the last
        // same key would be (n-lkey+1) from starting
        int skey = Size-lkey+1;
        int count=1;
        Node curr = head;
        Node prev = null;
        while(count<skey){
            prev =curr;
            curr = curr.next;
            count++;
        }
        prev.next = curr.next;

        //          OR ()another way of writing)
        // itn prevkey = Size-lkey;
        // int i=1;
        // Node prev =head;
        // while(i<prevkey){
        //     prev = prev.next;
        //     i++;
        // }
        // prev.next = prev.next.next;
        System.out.println("Previous node "+prev.data);
        System.out.println("Current node "+curr.data);
        
    }
    public static void main(String[] args) {
        remove_from_last ll = new remove_from_last();
        ll.addfirst(10);
        ll.addfirst(8);
        ll.addfirst(7);
        ll.addfirst(4);
        ll.addfirst(2);
        ll.printll();
        System.out.println(ll.Size);
        ll.rem_from_last(4);
        ll.printll();
    }
}
