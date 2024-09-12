package linkList;

public class Linkedlist {
    public class Node {
        int data;
        Node next;

        public Node(int data){
            this.data =data;
            this.next = null;
        }

    }
    
    public static Node head;
    public static Node tail;
    public static int size;

    public void addfirst(int data){
        // Time complexity O(1)
        Node newNode = new Node(data);
        size++;
        if(head ==null){
            head =tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addlast(int data){
        // Time complexity O(1)
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next = newNode;
        tail=newNode;
    }

    public void printlist(){
        // Time complexity O(n)
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void addmid(int data,int index){
        // Time complexity O(n)
        if(head==null){
            addfirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int count=0;
        while(count<index-1){
            temp= temp.next;
            count++;
        }
        //System.out.println(temp.data);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void removeFirst(){
        if(head==null){
            return;
        }
        
        else if(size==1){
            head=tail=null;
            size=0;
        }
        else{
            head = head.next;
            size--;
        }
    }

    public void removeLast(){
        if(head==null){
            System.out.println("No element present");
            return;
        }
        else if(size==1){
            head=tail=null;
            size=0;
        }
        else{
            Node temp = head;
            
            // while(temp.next!=null){
            //     temp = temp.next;
            // }
            // Node temp2 = head;
            // while(temp2.next!=temp){
            //     temp2 = temp2.next;
            // }
            // temp2.next=null;
            // tail=temp2;
            // size--;
            // OR
            for(int i=0;i<size-2;i++){
                temp = temp.next;
            }
            temp.next=null;
            tail=temp;
            size--;
        }
    }

    

    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.addfirst(12);
        ll.addfirst(8);
        ll.addfirst(7);
        ll.addfirst(4);
        ll.addlast(13);
        ll.addmid(9, 3);
        ll.printlist();
        System.out.println("the size of linkedlist is "+ ll.size);


        //System.out.println("the tail points to "+ll.tail.data);
        //System.out.println("the head points to "+ll.head.data);
        ll.removeFirst();
        ll.printlist();
        System.out.println("the size of linkedlist is "+ ll.size);
        ll.removeLast();
        ll.printlist();
        System.out.println("the size of linkedlist is "+ ll.size);
        
        }
    }


