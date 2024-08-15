package Assignments.Set_1;
import java.util.Scanner;


public class Problem_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rectangle : ");
        int Length = sc.nextInt();
        System.out.println("Enter the breadth of rectangle :  ");
        int Breadth = sc.nextInt();
        int area = Length * Breadth;
        System.out.println("The area of the rectangle is : "+area);
    }
}
