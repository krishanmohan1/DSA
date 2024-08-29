package RECURSION_3;

import java.util.Scanner;

public class FindPowerOfPtoThePowerQ {

    static int pow(int n , int m){    //  p^q
        // base case
        if(m == 0) return 1;
        return pow(n , m-1) * m;   // p^q-1 * p --> p^q
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(pow(n,m));

    }
}
