package RECURSION_4;

import java.util.Scanner;

public class PrintSumWithAlternateSign {

    static int printAlternate(int n ){

        if(n==0 || n==1) return n;
        if(n%2==0){
            return printAlternate(n-1) - n;
        }
        else return printAlternate(n-1) + n;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(printAlternate(n));
    }
}
