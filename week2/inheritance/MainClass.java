package week2.inheritance;


public class MainClass {
    public static void main(String[] args) {
        Student stud = new Student();
        stud.name="Arpitha";
        stud.marks=85;

        stud.displayMarks();
        stud.displayName();

        Cat cat = new Cat();
        cat.sound();


        Dog dog = new Dog();
        dog.sound();

        Bank bank = new Bank();
        bank.getRankOfInterest();



        Shape shape = new Circle();
        shape.draw();


       Student student = new Student();
        student.displayMarks();



    }
}
