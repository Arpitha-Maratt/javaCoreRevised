package week2.inheritance;

public class Bank {
    int getRankOfInterest(){
        return 5;
    }
}

class SBI extends Bank{
    @Override
    int getRankOfInterest(){
        return 7;
    }
}
