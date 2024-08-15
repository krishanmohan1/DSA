package Conditionals;
import java.util.Scanner;


public class divisibleby5and3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        // if(num%15==0) you can also use this.
         if(num%5==0 && num%3==0){
            System.out.println("its is divisible by 5 and 3");
        }
        else{
            System.out.println("it is not divisible by both ");
        }
    }
}
