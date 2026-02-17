package week2.inheritance;

public class Animal {

    public void sound(){
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal{
    @Override
    public void sound(){
        super.sound();
        System.out.println("Dog barks");
    }
}

class Cat extends Animal{
    @Override
    public void sound(){
        System.out.println("Cat sound meow ");
    }
}
