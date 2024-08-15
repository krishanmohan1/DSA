package Conditionals;
import java.util.Scanner;


public class absoluteValueOfInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter an integer : ");
        int n = sc.nextInt();
        if(n<0){
            System.out.println("The absolute value of " + n +" is " + (-n) );

        }
        else {
            System.out.println("The absolute value of "+ n +" is " + n);
        }

    }
}
