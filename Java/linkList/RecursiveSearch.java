package linkList;

public class RecursiveSearch {
    // Time complexity O(n)
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

    public int helper(Node head,int key){
        // Base Case
        if(head==null){
            return -1;
        }
        if (head.data ==key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }

    public int Recsearch(int key){
         // Time complexity and space complecity O(n)
        return helper(head,key);
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
        RecursiveSearch ll = new RecursiveSearch();
        ll.addfirst(15);
        ll.addfirst(14);
        ll.addfirst(13);
        ll.addfirst(12);
        ll.printlist();
        System.out.println(ll.Recsearch(15));
        System.out.println(ll.Recsearch(17));
    }
}
