package Conditionals;
import java.util.Scanner;


public class divisibleBy5NotBy3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter your nu. : ");
        int num = sc.nextInt();
        if(num%5==0 && num%3!=0){
            System.out.println("It is divisinle by 5 but not with 3");
        }else  {
            System.out.println("it is not");

        }

    }
}
