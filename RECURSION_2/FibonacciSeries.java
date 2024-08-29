package RECURSION_2;

import java.util.Scanner;

public class FibonacciSeries {

    static int finonacci(int n ){

        // base case

        if(n == 0 ) return 0;
        if(n == 1) return 1;

        /*
        if(n == 0 || n == 1){
        return n;
         */

        // sub Problem -- recursive Work

        int prev = finonacci(n-1);
        int prevPrev = finonacci(n-2);

        // self work

        int ans = prevPrev + prev ;
        return ans ;

        /*
        return prev + prevPrev;
         */

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // it gives the nth fibonacci number

        /*
        int ans = finonacci(n)
        System.out.println(ans);
        */

        /*
        if you want to print the series upto nth term .
         */

        for(int i = 0 ; i <= n ; i++){
            System.out.println(finonacci(i));
        }
    }
}
