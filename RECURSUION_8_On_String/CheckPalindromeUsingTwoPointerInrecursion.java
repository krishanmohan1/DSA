package RECURSUION_8_On_String;

import java.util.Scanner;

public class CheckPalindromeUsingTwoPointerInrecursion {

    static boolean check(String s , int l , int r){
        // Base case
        if(l>=r) return true;
        // sub problems
        boolean smallProb = check(s , l+1, r-1);
        // self work
        return (s.charAt(l) == s.charAt(r) && smallProb);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int l = 0;
        int r = s.length()-1;
        System.out.println(check(s,l,r));

    }
}
