package Hashing_package;

import java.util.ArrayList;
import java.util.LinkedList;

public class ImplementingHashMapCode {
    public static void main(String[] args) {
        HashMapCode<String, Integer> map = new HashMapCode<>();
        map.put("India", 1);
        map.put("China",2);
        map.put("Us", 3);

        ArrayList<String> keys = map.Keyset();
        for(String key : keys){
            System.out.println(key);
        }
        System.out.println(map.get("India"));
    }
}

 class HashMapCode <K,V>{ // making key and value generic type therefore it can be int boolean string 
   private class Node{
         K key;
         V value;

        public Node(K key,V value){
            this.key=key;   
            this.value=value;
        }
    }
    private int nodeCount;
    private int bLength;
    private LinkedList<Node> buckets[];

    public HashMapCode(){
        this.bLength=4;
        // Initalize Bucket Array
        this.buckets = new LinkedList[bLength];
        // Initialize Empty linkedlist in each bucket 
        for(int i=0;i<4;i++){
            this.buckets[i] = new LinkedList<>();
        }
    }

    public int hashFunction(K key){
        int hc = key.hashCode();
        // converting it to positive  
        int phc = Math.abs(hc);
        // Converting it to the range of 0 to size-1
        return phc%bLength;
    }

    public int searchLinkedList(K key,int bi){
        LinkedList<Node> ll = buckets[bi];
        for(int i=0;i<ll.size();i++){
            if(ll.get(i).key.equals(key)){
                return i;
            }
        }
        return -1;
    }

    private void rehash(){
        LinkedList<Node> [] oldbucket = buckets;
        buckets = new LinkedList[bLength*2];
        bLength=2*bLength;
        for(int i=0;i<buckets.length;i++){
            buckets[i]= new LinkedList<>();     // Empting the bucket
        }
        for(int i=0;i<oldbucket.length;i++){
            LinkedList<Node> ll = buckets[i];  // adding previous data now
            for(int j=0;j<ll.size();j++){
                Node n = ll.remove();
                put(n.key,  n.value);
            }
        }
    }

    public void put(K key , V value){   // Time Complexity = O(lambda) -> O(1)
        int bindex = hashFunction(key);
        int dindex = searchLinkedList(key, bindex);

        if(dindex!=(-1)){
           Node n =  buckets[bindex].get(dindex);
           n.value = value;
           return;
        }
        else{
            buckets[bindex].add(new Node(key, value));
            nodeCount++;
        }

        // Checking for ReHashing
        double lamda = (double)nodeCount/bLength;
        // Checking if lamda greater than threshold limit
        if(lamda>2){
            rehash();
        }
    }

    public boolean containsKey(K key){ // Time Complexity O(1)
        int bindex = hashFunction(key);
        int dindex = searchLinkedList(key, bindex);

        if(dindex!=(-1)){
            return true;
        }
        return false;
    }

    public V remove(K key){  // Time Complexity O(1)
        int bindex = hashFunction(key);
        int dindex = searchLinkedList(key, bindex);

        if(dindex!=(-1)){
            Node n= buckets[bindex].remove(dindex);
            nodeCount--;
            return n.value;
        }
        return null;
    }
    public V get(K key){  // Time Complexity O(1)
        int bindex = hashFunction(key);
        int dindex = searchLinkedList(key, bindex);

        if(dindex!=(-1)){
            return buckets[bindex].get(dindex).value;
        }
        return null;
    }
    public ArrayList<K> Keyset(){
        ArrayList<K> keys = new ArrayList<>();

        for(LinkedList<Node> ll : buckets){
            for(Node n : ll){
                keys.add(n.key);
            }
        }
        return keys;

    }
    public boolean isEmpty(){
         return (nodeCount==0);
    }
}
