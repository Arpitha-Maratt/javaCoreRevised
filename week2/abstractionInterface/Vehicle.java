package week2.abstractionInterface;

interface Vehicle {
    void start();
}

class  Bike implements  Vehicle{
    @Override
    public void start(){
        System.out.println("Bike starts with key");
    }
}

