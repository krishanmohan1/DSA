package RECURSION_4;

import java.util.Scanner;

public class PrintK_MultiplesOF_Num {
    static void printMultiples(int num , int k){

        // base case

//        if(k==0) return; it will also work , in this case k = 1 is handelled in the self work


        if(k==1) {
            System.out.print(num+" ");
            return ;
        }

        // recursive work or sub problem
        printMultiples(num,k-1);

        // self work
        System.out.print(num*k+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = sc.nextInt();
        printMultiples(num,k);
    }
}
