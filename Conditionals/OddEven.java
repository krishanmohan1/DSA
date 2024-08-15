package Conditionals;
import java.util.Scanner;


public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.println("Enter your number : ");
        int num_1 = sc.nextInt();

        if( num_1 % 2 == 0 ){
            System.out.println("Given number is even");
        }
        else
            System.out.println("given number is odd ");
    }
}
