package Assignments.Set_1;
import java.util.Scanner;


public class problem_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int x= sc.nextInt();

        System.out.println("Enter second number : ");
        int y= sc.nextInt()    ;

        System.out.println("Before swapping ");
        System.out.println("first number : "+x);
        System.out.println("Seond number : "+y);


        int temp=x;
         x = y;
         y = temp;
        System.out.println("After Swapping ");
        System.out.println("First number : "+x);
        System.out.println("Second number : "+y);








    }

}
