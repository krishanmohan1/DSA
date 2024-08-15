package Assignments.Set_14;
import java.util.Scanner;
public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Problem_1 obj = new Problem_1();
        System.out.println(average(a,b,c));
    }
    public static int average(int a,int b,int c){
         return (a+b+c)/3;





    }
}
