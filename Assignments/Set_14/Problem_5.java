package Assignments.Set_14;

//Write a Java method to find the smallest number among three numbers.
import java.util.Scanner;
public class Problem_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(smallest(a,b,c));
    }
    public static int smallest(int a , int b, int c){
        return Math.min(a,(Math.min(b,c)));
    }
}
