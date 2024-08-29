package RECURSION_2;

import java.util.Scanner;

public class FactorialInShortCode {

    static  int factorial(int n){
        // base case or halting case
        if( n == 0 || n == 1){
            return  1;
        }
        // sub problem

//        int a = factorial(n-1);

        // self work
         return n * factorial(n-1);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0 ; i <= n ; i++){
            System.out.println(factorial(i));
        }
    }
}
