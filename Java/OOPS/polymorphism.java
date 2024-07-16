package OOPS;

public class polymorphism {
    public static void main(String[] args) {
        fun f1 = new fun();
        System.out.println(f1.sum(5.0f,6.2f));
        fun1 f5 = new fun1();
        //  THE OBJECT OF CHILD CLASS WILL CALL THE FUNCTION OF CHILD CLASS AND NOT PARENT CLASS
        f5.eat();
    }
}

class fun{
    // FUNCTION OVERLOADING
    int sum (int a , int b ){
        return a+b;
    }

    int sum(int a , int b , int c){
        return a+b+c;
    }
    float sum(float a , float b){
        return a+b;
    }

    // function overriding
    void eat(){
        System.out.println("eat anything");
    } 
}

class fun1 extends fun{
    void eat(){
        System.out.println("eat only plant");
    }
}