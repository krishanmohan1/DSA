package Assignments.Set_14;

import java.util.Scanner;
// write a java method to check whether a year(integer ) entered by user is a leap year or not.

class calculation{
    public static void  is_LeapYear(int year){
        if(year%4==0 && year%400==0 && year%100!=0){
            System.out.println("It is leap year");
        }
        else{
            System.out.println("It is not a leap year");
        }
    }
}
public class Problem_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = sc.nextInt();
        System.out.println((year));
    }
}
