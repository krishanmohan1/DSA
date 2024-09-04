package RECURSUION_8_On_String;

import java.util.Scanner;

public class ReverseOfStringUsingRecursion {

    static  String reverse2(String s){
        if(s.length()==0) return "";

        String smallAns = reverse2(s.substring(1));
        char curr = s.charAt(0);
        return smallAns + curr;
    }

    static String reverse(String s , int idx){

        // Base Case
        if(s == "") return ""; // or you can say s.length() == 0 return "";
        if(idx == s.length()) return "";

        // recursive Work
        String smallAns = reverse(s , idx+1);
        char curr =s.charAt(idx);

        // Self Work
        return smallAns + curr;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverse(s,0));
        System.out.println(reverse2(s));





    }
}
