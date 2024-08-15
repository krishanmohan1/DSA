package Loop.Practice_Problems;
import java.util.Scanner;


public class FactorialOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int x=sc.nextInt();
        int fact=1;
        for(int i =1; i<=x;i++){
//            fact=fact*i;
            fact*=i;
       }
        System.out.println(fact);


    }
}
