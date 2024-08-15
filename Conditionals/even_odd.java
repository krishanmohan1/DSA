package Conditionals;
import javax.swing.*;
import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int number = sc.nextInt();

//        syntax for if statement
//                if(condition){
//                    /*code*/
//                }
//                else {
//
//                }
        if(number%2==0){
            System.out.println("Entered number is even ");
        }

        if( number%2 != 0){
            System.out.println("Entered number is odd ");
        }

        // esse bhi chal sakta hai

//        else {
//            System.out.println("It is odd number ");
//
//        }



    }

}
