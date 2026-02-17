package week1;


import java.util.Scanner;

public class EvenOrOdd {
    public void evenOrOdd(){
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if(number %2 ==0){
            System.out.println("Even");
        } else{
            System.out.println("Odd");
        }

    }
}
