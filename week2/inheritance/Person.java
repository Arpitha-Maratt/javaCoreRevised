package week2.inheritance;

public class Person {
    String name;

    void displayName(){
        System.out.println("Name:"+name);
    }

}

class Student extends Person{
    int marks;

    void displayMarks(){
        System.out.println("Marks:"+marks);
    }
}
