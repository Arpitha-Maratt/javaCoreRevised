package week2.abstractionInterface;

abstract class Animal {

    abstract void sound();

    void eat(){
        System.out.println("Animal eat food");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}
