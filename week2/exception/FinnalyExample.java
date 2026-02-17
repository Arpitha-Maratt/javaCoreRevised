package week2.exception;

public class FinnalyExample {
    public static void main(String[] args) {
        try{
            int x=10/2;
            System.out.println(x);
        }catch (Exception e){
            System.out.println("Error occured");
        }finally {
            System.out.println("This will always executed");
        }
    }
}
