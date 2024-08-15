package Conditionals;

import java.util.Scanner;

// number is divisible by 5 or 3 but no divisible by 15

public class nestedThreeAndFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num = sc.nextInt();


             // with using nesting loop


//        if(num%3==0 || num%5==0){
//            if(num%15!=0){
//                System.out.println("number is divisible by 3 or 5 but not with 15");
//            }
//            else{
//                System.out.println("number is divisible by 3 or 5 and also with 15");
//
//            }
//        }else{
//            System.out.println("Number is not divisible by 3 or 5 ");
//        }

        // without using nesting loop

        // yaha par dhyan do (&& > || ) en dono ko aise bina brackect ke nhi de sakte hai

        if((num%3 == 0 || num%5 == 0) && num%15 != 0){

            // yaha do do logical operator hai , yaha par chije aasan nhi hoti

            System.out.println("number is divisible by 3 or 5 but not with 15");
        }
        else{
            System.out.println("Not matching the required condition");
        }

    }
}
