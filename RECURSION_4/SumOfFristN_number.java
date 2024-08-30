package RECURSION_4;

import java.util.Scanner;

public class SumOfFristN_number {

    static int printSum(int n ){
        if(n==0) return 0;
        if(n==1) return n;
        return printSum(n-1) + n;

//        int subProb = printSum(n-1);
//        int ans = subProb + n;
//        return ans ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(printSum(n));
    }
}
