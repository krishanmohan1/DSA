package BasicsOfjava;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // ye ek Scanner class defie larte hai
        System.out.println("Enter the principal amount: ");

        float principal = sc.nextFloat(); // C programming me Cin >> se input lete hai


        System.out.println("Enter the Rate:  ");
        float Rate = sc.nextFloat();

        System.out.println("Enter the Time :  ");
        float  Time = sc.nextFloat();
        float Simple_interest = (principal * Rate * Time)/100;
        System.out.println("Your Simple Interest is " + Simple_interest);




    }
}
