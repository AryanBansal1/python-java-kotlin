package linkList;

public class palindromell {

    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public boolean checkpalindrome(){
        // Time complexity O(n) and space complexity O(1)

        // Base case
        if(head ==null || head.next==null){
            return true;
        }

        // Finding mid using slow fast approach
        Node slow = head;
        Node fast = head;
        while(fast !=null && fast.next !=null){
            slow = slow.next;   // +1
            fast = fast.next.next; // +2
        }
        // reversing the other half
        Node curr = slow.next;
        Node next;
        Node rightHead;
        while(curr!=null){
            next = curr.next;
            curr.next = slow;
            slow = curr;
            curr = next;
        }
        rightHead = slow;

        //comparing both the half
        for(int num=0;num<size/2;num++){
            if(head.data != rightHead.data){
                return false;
            }
            head = head.next;
            rightHead = rightHead.next;
        }
        return true;
    }

    public void addlast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
        }
        tail.next=newNode;
        tail = newNode;
    }

    public void printll(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        palindromell ll = new palindromell();
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(1);
        ll.printll();
        System.out.println( ll.checkpalindrome());

    }
    
}
