package Conditionals;
import javax.swing.*;
import java.util.Scanner;


public class leapYearProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your year :  ");
        long year = sc.nextLong();
        if((year%4==0 && year%2==0) && (year%100!=0)) {
            System.out.println("Entered year is leap year ");
        }
            else {
                System.out.println("Sorry , this is not a leap year");
            }

    }
}
