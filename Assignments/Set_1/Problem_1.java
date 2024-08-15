package Assignments.Set_1;
import java.util.Scanner;


public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first integer : ");
        int x = sc.nextInt();
        System.out.println("Enter the Second integer : ");
        int y = sc.nextInt();
        int product = x*y;
        System.out.println("The product of two integer is : "+product);
    }
}
