package Conditionals;
import java.util.Scanner;


public class twoDigitNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your two digit no. : ");
        int number = sc.nextInt();
        if( number>9 && number<100){
            System.out.println("is is a two digit number ");

        }
        else {
            System.out.println("it is not");
        }
    }
}
