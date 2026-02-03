package week2.exception;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class Bank {
    int balance = 5000;

    void withdraw(int amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Not enough balance");
        }
        balance -= amount;
        System.out.println("Withdrawal successful");
    }
}



