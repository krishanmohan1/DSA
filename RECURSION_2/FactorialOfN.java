package RECURSION_2;

import java.util.Scanner;

public class FactorialOfN {

    static int  printFactorial(int n ){

        /*
        // base condition or smallest  sub problem
        int ans = 1;
        if(n == 0){
            return 1;
        }
        // sub Problem
        printFactorial(n-1);
        // self work
        ans = n*printFactorial(n-1);
        return ans;

         */

        // base case
        if(n==0) return 1;
        // Small  Problem - recursive Problem
        int smallAns = printFactorial(n-1);
        // big problme - self work
        int ans = n * smallAns;
        return ans;

        /*
        In short we can also write this code in this form
        if(n==0) return 1;
        return n * printFactorial(n-1);
         */


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int ans =printFactorial(n);
        System.out.println(ans);
    }
}
