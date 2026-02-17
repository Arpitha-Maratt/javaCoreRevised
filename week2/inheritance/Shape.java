package week2.inheritance;

public class Shape {
    void draw(){
        System.out.println("Drawing shape");
    }
}

class Circle extends  Shape{
    void draw(){
        System.out.println("Drawing circle");
    }
}


