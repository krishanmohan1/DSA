package Loop.Practice_Problems;
import java.util.Scanner;


public class SumOfDigitInANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // Sum Of Digits Of A number .


        int n = sc.nextInt();
        int sumOfDigit = 0;
        int Original_n=n;

        while (n>0) { // ye tab tak chalega jab tak , input n zero na ho jaye..

           sumOfDigit+=n % 10;  // yaha par modulo se last digit nikal ke sum me add kar rahe hai
           n=n/10; // phir input n ke last digit ko hatah ke jo bacha ukso store kara raha hai

        }
      /*
        System.out.println(" Sum of digit in "+  + " is "+ sumOfDigit);

        yaha dekho yaha par n -> 0 ho gya hai , isiliye input ko ek kisi aur variable bana ke store kar lenge .
       */



    }
}
