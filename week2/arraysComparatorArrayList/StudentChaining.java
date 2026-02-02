package week2.arraysComparatorArrayList;

public class StudentChaining {
    String name;
    int age;

    StudentChaining(){
        this("Unknown",0);  //call parameterized constructor
        System.out.println("Default constructor called");
    }

    StudentChaining(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("Parameterized constructor called for "+name);
    }

    void display(){
        System.out.println("Name: "+name+", Age:" +age);
    }
}
