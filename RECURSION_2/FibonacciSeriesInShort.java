package RECURSION_2;

import java.util.Scanner;

public class FibonacciSeriesInShort {

    static int fibonacci(int n ){
        if(n == 0 || n== 1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

//    static int fibonacci(int n ){
//        if(n == 0 || n == 1){
//            return n ;
//        }
//
//        int prev = fibonacci(n-1);
//        int prevprev = fibonacci(n-2);
//
//        int ans = prevprev + prev;
//        return ans;
//
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i =0 ; i <= n; i++){
            System.out.println(fibonacci(i));
        }
    }
}
