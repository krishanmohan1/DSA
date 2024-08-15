package Assignments.Set_1;
import  java.util.Scanner;

public class Problem_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number  = sc.nextInt();
        int cube = number *number *number ;
        System.out.println("The cube of the "+ number+ " -is : "  + cube);
    }
}
