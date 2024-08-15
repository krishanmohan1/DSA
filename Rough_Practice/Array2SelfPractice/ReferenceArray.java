package Rough_Practice.Array2SelfPractice;
import java.io.*;

import java.util.Scanner;


public class ReferenceArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = {1,2,3,4,5,};
        int n = a.length;
        int b[] = new int[n];
        // yaha par a=b nhi kar sakte hain galat output dega .
        b=a;
        b[0]=9;
        System.out.println("Original Array");
        for(int i = 0; i<n;i++){
            System.out.println(a[i] + " ");
        }
        System.out.println("Referenced array");
        for(int i = 0 ; i<n;i++){
            System.out.println(b[i] + " ");
        }


    }
}
