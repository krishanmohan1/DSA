package RECURSUION_8_On_String;

import java.util.Scanner;

public class RemoveAllZerosFromTheString {

    static String removeA(String s , int idx){
        // base case
        if(idx == s.length()) return "";
        // recursive Work
        String smallAns = removeA(s, idx + 1);
        // self work
        char curr = s.charAt(idx);
        if(curr!='a' && curr != 'A'){
            return curr + smallAns;
        }else{
            return smallAns;
        }

    }

    static String removeA2(String s){
        // base Condition
        if(s.length()==0) return "";
        // recursive work
        String smallAns = removeA2(s.substring(1));
        //self work
        char curr = s.charAt(0);
        if(curr != 'a' && curr != 'A') return curr + smallAns;
        return smallAns;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(removeA(s,0));
        System.out.println(removeA2(s));

    }
}
