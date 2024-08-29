package RECURSION_3;

import java.util.Scanner;

public class AlternateApproachToPower {
    static int power1(int p , int q){
        if( q == 0) return 1;
        int smallPow = power1(p,q/2); // kyu ki ye dono jagah kaam aayega .
        if(q%2==0) {
            return smallPow * smallPow;
        }
            return p * smallPow * smallPow;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        System.out.println(power1(p,q));
    }
}
