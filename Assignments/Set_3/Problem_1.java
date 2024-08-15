package Assignments.Set_3;
import java.util.Scanner;


public class Problem_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        float y = ((((x+8)/3)%5)*5);
        System.out.println(y);
    }
}
