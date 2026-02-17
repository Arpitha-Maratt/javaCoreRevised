package week2.abstractionInterface;

interface Writable {

    void write(String text);
}

public class Functinal implements  Writable{

    @Override
    public void write(String text){
        System.out.println(text);
    }

}

