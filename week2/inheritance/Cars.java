package week2.inheritance;

public class Cars {

    private int id;
    private String name;
    private String color;
    private String brand;

    public Cars(int id){
        this.id =  id;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    public static void main(String[] args) {
        Cars cars = new Cars(101);
        System.out.println(cars.getId());
    }
}
