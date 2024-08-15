package Conditionals;
import java.util.Scanner;

// Check number is divisible by or not

public class divisibleby5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        long number = sc.nextLong();
        if(number%5==0){
            System.out.println("Entered number is divisible by 5");
            System.out.println("Hell Good Morning ");

        }
        else {
            System.out.println("Entered number is not divisible by 5");
            System.out.println("Good evening");
        }

    }
}
