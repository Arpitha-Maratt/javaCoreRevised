package week2.polymorphism;


//methid overloading ; same method name,diff parameter ,complie time polymorphism

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println(calculator.add(1,2));
        System.out.println(calculator.add(1.4,3.4));

        Parent parent = new Parent();
        parent.show();

        Parent child = new Child();
        child.show();

    }
}
