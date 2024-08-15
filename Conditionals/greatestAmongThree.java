package Conditionals;
import java.util.Scanner;


public class greatestAmongThree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your 1st number : ");
        int num_1 = sc.nextInt();
        System.out.println("Enter your 2nd number : ");
        int num_2=sc.nextInt();
        System.out.println("Enter your 3rd number ");
        int num_3=sc.nextInt();


        if(num_1>num_2 && num_1>num_3){ // num_1 is greatest
            System.out.println("num_1 is the greatest number  ");
        }
        else if(num_2>num_1 && num_2>num_3){ // num_2 is greatest
            System.out.println("num_2 is the greatest number  ");
        }
        else { // num_is greatest
            System.out.println("num_3 is the greatest number  ");
        }



        // esko aab bina && aur || ko use kiye banao
        // nested loop ko usekaro..








    }
}
