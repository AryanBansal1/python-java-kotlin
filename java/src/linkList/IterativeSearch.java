package linkList;

public class IterativeSearch {
   
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next=null;
        }

    }
    public static Node head;
    public static Node tail;

    public int search(int key){
         // Time complexity O(n)
        Node temp =head;
        int count =0;
        while(temp!=null){
            if(temp.data == key){
                return count;
            }
            temp=temp.next;
            count++;
        }
        return -1;
    }

    public void addfirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void printlist(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        IterativeSearch ll = new IterativeSearch();
        ll.addfirst(15);
        ll.addfirst(14);
        ll.addfirst(13);
        ll.addfirst(12);
        ll.printlist();
        System.out.println(ll.search(15));
    }
}
