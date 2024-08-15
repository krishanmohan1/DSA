package Conditionals;
import java.util.Scanner;


public class divisibleBy3or5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number : ");
        int num=sc.nextInt();

        if(num %3==0 || num%5==0){
            System.out.println("it is divisible by 3 0r 5 ");
        }else {
            System.out.println("not satisfying the reason");
        }


    }
}
