package Queue_package;
import java.util.*;
public class QueueUsingTwoStack {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.add(4);
        q.add(4);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}

class MyQueue{
     Stack<Integer> s1 = new Stack<>();
     Stack<Integer> s2 = new Stack<>();

    public  boolean isEmpty(){
        return s1.isEmpty();
    }

    public  void add(int data){  // O(n)
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(data);
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }
    public  int remove(){
        if(s1.isEmpty()){
            System.out.println("already empty");
            return -1;
        }
        return s1.pop();
    }
    public  int peek(){
        if(s1.isEmpty()){
            System.out.println("already empty");
            return -1;
        }
        return s1.peek();
    }
}


