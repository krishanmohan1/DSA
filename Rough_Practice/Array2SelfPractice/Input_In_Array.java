package Rough_Practice.Array2SelfPractice;
import java.io.*;
import java.util.*;

public class Input_In_Array {
    public static void main(String[] args) {
        System.out.println("Enter the size");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("ENter the inputs of array");
        int a[] = new int[n];
        for(int i = 0 ; i<n;i++){
            a[i]=sc.nextInt();

        }
        System.out.println("Printing the array ");
        for(int i = 0; i<n;i++){
            System.out.println(a[i] + " ");
        }


    }
}
