package Assignments.Set_3;
import java.util.Scanner;


public class Problem_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your three digit number: ");
        int x =sc.nextInt();

        int sum=0;

        while(x>0){

            sum=sum+(x%10);

            x=x/10;


        }
        System.out.println(sum);
    }
}
