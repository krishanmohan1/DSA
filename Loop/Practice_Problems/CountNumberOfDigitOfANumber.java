package Loop.Practice_Problems;

   // count the number of digits of a given number

import java.util.Scanner;


public class CountNumberOfDigitOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter the number :  ");
        int num = sc.nextInt();
        int noOfDigit=0;

        while(num>0){
            num=num/10;
            noOfDigit++;

        }
        System.out.println(noOfDigit);



    }
}
