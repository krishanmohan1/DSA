package Conditionals;
import java.util.Scanner;



//****** Take a positive integer input and tell if it is a three digit number or not.

public class threeDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = sc.nextInt();
        if(number>99 && number <1000){
            System.out.println("Given no. is three digit no.");

        }
        else {
            System.out.println("its is not");
        }
    }
}
