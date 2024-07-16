package OOPS;

public class abstraction {
    public static void main(String[] args) {
     mammal giraffe = new mammal();  
     giraffe.eat();
     giraffe.legs();
    }
}

abstract class animal {
    void eat(){
        System.out.println("eats anything");
    }
    abstract void legs();
}
class mammal extends animal{
    void type(){
        System.out.println("stays on land");
    }
    void legs(){
        System.out.println("it has 4 legs");
    }
}