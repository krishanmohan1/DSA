package Conditionals;
import java.util.Scanner;

public class divisibleWith3or5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num = sc.nextInt();
        if(num%5==0 || num%3==0){
            System.out.println("it is divisible by 5 or 3");
        }
        else{
            System.out.println("it is neither divisible by 5 nor 3");
        }
    }
}
