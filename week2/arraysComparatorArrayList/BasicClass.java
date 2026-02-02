package week2.arraysComparatorArrayList;

public class BasicClass {
    String name;
    int age;

    BasicClass(){
        this.name="Unknow";
        this.age=0;
        System.out.println("Default constructor called");
    }

    BasicClass(String name, int age){
        this.name=name;
        this.age=age;
        System.out.println("Parameterized constructor called for"+name);
    }

    BasicClass(String name){
        this.name=name;
        this.age=18;
        System.out.println("Overload constructor called for "+ name);
    }

    void display(){
        System.out.println("Name: "+ name + ",Age: "+age);
    }
}
