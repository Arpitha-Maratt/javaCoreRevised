package week2.exception;

public class ArithmeticExceptionDemo {
    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) { // Java's built-in exception
            System.out.println("Cannot divide by zero");
        }

        System.out.println("Program continues normally");
    }
}
