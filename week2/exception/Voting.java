package week2.exception;

public class Voting{
    public static void main(String[] args) {
        int age = 16;
        try{
            if(age<18){
                throw new InvalidAgeException("Not eligible to vote");
            }
            System.out.println("Eligible to vote");
        }catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
