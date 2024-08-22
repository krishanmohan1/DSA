package Introduction_2D_Array;

import
























































        java.util.*;
import java.io.*;
public class MultiplicationOfTwoMatric {

//    public static void printArray(int[][]arr) {
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; i < arr[i].length; j++) {
//                System.out.print(arr[i][j]);
//            }
//
//        }
//        System.out.println();
//
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("row of m1: ");
        int m = sc.nextInt();
        System.out.println("col of m1: ");
        int n = sc.nextInt();

        int [][] arr = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("row of m2: ");
        int m2 = sc.nextInt();
        System.out.println("colmn o m2: ");
        int c2 = sc.nextInt();

        int arr2[][] = new int[m2][c2];
        System.out.println("matrix2 input: ");
        for(int i =0;i<m2;i++){
            for(int j=0;j<c2;j++){
                arr2[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<m2;i++){
            for(int j=0;j<c2;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }

        // final matrix
        int mul[][]=new int[m][c2];
        for(int i=0;i<m;i++){
            for(int j =0;j<c2;j++){
                mul[i][j]=0;
                // this k loop is out of thinking
                for(int k=0; k<n;k++)

                mul[i][j]+=arr[i][k]*arr2[k][j];

            }
        }
        System.out.println("Final matrix: ");
        for(int i=0;i<m;i++){
            for(int j = 0;j<c2;j++){
                System.out.print(mul[i][j]+" ");
            }
            System.out.println();
        }





    }
}
