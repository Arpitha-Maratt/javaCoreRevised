package week2.abstractionInterface;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Animal animal = new Dog();
        animal.sound();
        animal.eat();

        Vehicle vehicle = new Bike();
        vehicle.start();

        SmartPhone smartPhone = new SmartPhone();
        smartPhone.takePhoto();
        smartPhone.playMusic();

        Shape shape = new Circle();
        shape.draw();
        shape.resize();

        Bird bird = new Peacock();
        bird.sound();

        Bird bird1 = new Parrot();
        bird1.sound();

        Car car = new model();
        car.display();

        Functinal functinal = new Functinal();
        functinal.write("I am Arpitha");

        ClonableInterface clonableInterface = new ClonableInterface(10,"Hello");

        ClonableInterface q = (ClonableInterface) clonableInterface.clone();
    }
}
