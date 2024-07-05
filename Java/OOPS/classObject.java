package OOPS;

public class classObject {
    public static void main(String[] args) {
        Pen trimax = new Pen();
        trimax.changecolor("Red");
        trimax.tipsize(12);
        System.out.println(trimax.color);
        System.out.println(trimax.tip);
        
    }
}

class Pen {
    String color;
    int tip;

    void changecolor(String clr){
        color = clr;
    }
    void tipsize(int ts){
        if(ts<11 && ts >0){
            tip = ts;
        }
        else{System.out.println("tipsize exceed the limit");}
    }
}
