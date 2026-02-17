package week2.exception;

public class Main {
    public static void main(String[] args) {
        Bank b = new Bank();
        try {
            b.withdraw(7000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}

