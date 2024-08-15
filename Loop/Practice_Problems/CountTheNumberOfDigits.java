package Loop.Practice_Problems;

import java.util.Scanner;


public class CountTheNumberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // count The number of Digits in a number

        int n = sc.nextInt();
        int numOfDigit=0;
        int original_n=n;


        while(n>0)
        {
        n = n/10;
        numOfDigit++; // numOfDigit = numOfDigit + 1


        }
        System.out.println("Number of Digit in "+ original_n + " is "+ numOfDigit );


    }
}
