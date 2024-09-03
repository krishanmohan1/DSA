package RECURSUION_8_On_String;

import java.util.Scanner;

public class CheckStringPlaindrome {

    static String reverse(String s){
        if(s.length() == 0) return "";
        String smallAns = reverse(s.substring(1));
        return smallAns + s.charAt(0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String rev = reverse(s);

        // to check two string is equals or not ,use equals() method

        if(rev.equals(s)){
            System.out.println("it is palindrome" );
        }else{
            System.out.println("it is not ");
        }

    }
}
