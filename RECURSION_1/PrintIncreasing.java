package RECURSION_1;

import java.util.Scanner;

public class PrintIncreasing {
    static void printIncreasing(int n ){  // 1 2 3 4 5 .... n-1 n.

        if(n==1){   // base case
            System.out.println(n);
            return;
        }

        printIncreasing(n-1);  // 1,2,3,4,...,n-1.  assumption
        System.out.println(n);      // self work
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        printIncreasing(n);
    }
}
