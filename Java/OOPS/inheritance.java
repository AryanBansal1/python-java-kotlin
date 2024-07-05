package OOPS;

public class inheritance {
    public static void main(String[] args) {
        dog pug = new dog();
        pug.legs = 4;
        pug.color = "Black";
        pug.breed = "cute";
        System.out.println(pug.color);

        Bird parrot = new Bird();
        parrot.color = "Orange";


    }
}

class Animal {
    String name;
    String color;
    String type;
}

class mammals extends Animal{
    int legs;
}

// MULTI-LEVEL INHERITANCE
class dog extends mammals{
    String breed;    
}
// HIERARCHIAL INHERITANCE
class Bird extends Animal{
    Boolean fly;
}
