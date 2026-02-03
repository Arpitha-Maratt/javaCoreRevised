package week2.abstractionInterface;

public interface Car {

    void display();
}

class model implements  Car{
    @Override
    public void display(){
        System.out.println("car");
    }
}
