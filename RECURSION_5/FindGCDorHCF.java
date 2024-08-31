

package RECURSION_5;

import java.util.Scanner;

public class FindGCDorHCF {     // brute force approach

    static int findGCD(int x , int y ){
        int m = Math.min(x,y);
        for(int i = m ; i >0;i--){
            if(x%i==0 && y%i==0){
                return i;
            }
        }
        return 1;
    }

    static int findGCD2ndApproach(int x , int y){
        while (x%y != 0){   // doesn't matter which is greater or smaller 0
            int rem = x % y;
            x = y;
            y = rem;
        }
        return y;
    }

    static int GCD(int x , int y ){
        if(y==0) return x;
        return GCD(y, x%y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(findGCD(x,y));
        System.out.println(GCD(x,y));
    }
}
