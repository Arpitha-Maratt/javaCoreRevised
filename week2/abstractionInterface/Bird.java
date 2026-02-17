package week2.abstractionInterface;

public interface Bird {
    void sound();
}

class Peacock implements Bird{
    @Override
    public void sound() {
        System.out.println("peacock make a sound");
    }
}

class Parrot implements  Bird{
    @Override
    public void sound(){
        System.out.println("parrot sound");
    }
}
