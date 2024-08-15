package Conditionals;
import  java.util.Scanner;


public class evenAndDivisibleBy3 {
    public static void main(String[] args) {
        Scanner sc =   new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num = sc.nextInt();

        if(num%2==0 && num%3==0){
            System.out.println("it is even and divisible y 3 ");
        }
        else{
            System.out.println("it is not following condition ");
        }
    }
}
