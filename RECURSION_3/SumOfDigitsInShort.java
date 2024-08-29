package RECURSION_3;

import java.util.Scanner;

public class SumOfDigitsInShort {

    public static int sumOfDigits(int n){
        // formula -->  f(N) = f(n/10) + n%10;
        if(n>=0 && n<=9) return n;
        return sumOfDigits(n/10) + n % 10;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(sumOfDigits(n));
    }
}
