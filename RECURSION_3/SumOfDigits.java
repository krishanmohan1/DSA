package RECURSION_3;

import java.util.Scanner;

public class SumOfDigits {

    static  int sum(int n){
        // base case : halting case
        if(n>=0 && n<=9) {
            return n;
        }

        // sub problem -- > recursive work
        int smallSum = sum(n/10);

        // self work
        int ans = smallSum + n % 10;
        return ans ;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);

        int n = sc.nextInt();

        System.out.println(sum(n));
    }
}
