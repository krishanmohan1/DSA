package BasicsOfjava;

import java.util.Scanner;

public class SumOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter your number_1");
        int num_1 = sc.nextInt();
        System.out.println("Enter your number_2");
        int num_2 = sc.nextInt();
        int add = num_1 + num_2;
        System.out.println("your sum of two number is: "+ add);




    }
}
