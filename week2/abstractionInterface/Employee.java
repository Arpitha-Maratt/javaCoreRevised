package week2.abstractionInterface;

abstract class Shape {
    abstract void draw();

    void resize(){
        System.out.println("Resize shape");
    }
}
class Circle extends Shape{

    @Override
    void draw() {
        System.out.println("Draw circle");
    }
}

