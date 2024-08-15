package ReversingAndRotatingOfArrayProblems;

import java.util.*;
public class SwapingOfTwoNumbers {

    static void swap2(int a, int b){
        int c;
        System.out.println("Orginal num: "+a);
        System.out.println("original num: "+b);
        c=a+b;
        a=c-a;
        b=c-b;

        System.out.println("After Swaping : "+a);
        System.out.println("After Swaping : "+b);
    }
////    static void swap(int a, int b){
////        System.out.println("Orginal Number : "+a);
////        System.out.println("Original Number : "+b);
////        int tem;
////        tem=a;
////        a=b;
////        b=tem;
////        System.out.println("After Swaping : "+ a);
////        System.out.println("After Swaping : "+b);
////    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first num");
        int a = sc.nextInt();
        System.out.println("Enter second num");
        int b = sc.nextInt();
        swap2(a,b);
    }

}
