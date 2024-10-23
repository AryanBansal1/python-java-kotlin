package stack_package;

import java.util.Stack;

public class nextGreater {

    public static void nextgreat(int arr[]){
        Stack<Integer> s = new Stack<Integer>();
        int nextg[] = new int[arr.length]; 
        for(int i=arr.length-1;i>=0;i--){
            while(s.isEmpty()==false && s.peek()<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()==true){
                nextg[i] = -1;
            }
            else{
                nextg[i] = s.peek();
            }
            s.push(arr[i]);
        }

        for(int i=0;i<nextg.length;i++){
            System.out.println(nextg[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        nextgreat(arr);
    }
}
