package linkList;

public class detecting_loop_ll {

    public static class Node {
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

        public void addfirst(int data){
            Node newNode = new Node(data);
            size++;
            if(head==null){
                head=tail=newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        public boolean detect_loop(){
            Node slow = head;
            Node fast = head;
            while(fast !=null && fast.next !=null){
                slow = slow.next;
                fast = fast.next.next;
                if(slow == fast){
                    return true;
                }
            }
            return false;
        }

        public void removeLoop(){
            Node slow = head;
            Node fast = head;
            Node prev = null;
            while(fast !=null && fast.next !=null){
                slow = slow.next;
                fast = fast.next.next;
                if(slow == fast){
                    slow =head;
                    break;
                }
               
            }
            System.out.println("the point of meeting " + fast.data);
            while(slow != fast){
                slow = slow.next;
                prev = fast;
                fast = fast.next;
            }
            System.out.println("the last element is "+ prev.data);
            prev.next = null;
        }

        public void print(){
            Node temp = head;
            while(temp !=null){
                System.out.print(temp.data +  " ");
                temp = temp.next;
            }
            System.out.println();
        }

    

    public static void main(String[] args) {
        detecting_loop_ll ll = new detecting_loop_ll();
        head = new Node(5);
        head.next = new Node(9);
        head.next.next = new Node(28);
        head.next.next.next = new Node(57);
        head.next.next.next.next = new Node(12);
        head.next.next.next.next.next = new Node(44);
        head.next.next.next.next.next.next = head.next.next;
        ll.removeLoop();
        ll.print();
    }
}
