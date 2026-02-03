package week2.abstractionInterface;

public class ClonableInterface implements Cloneable{
    int x;
    String y;
    public ClonableInterface(int x, String  y){
        this.x = x;
        this.y = y;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}