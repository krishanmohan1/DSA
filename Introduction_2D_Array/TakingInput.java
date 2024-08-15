package Introduction_2D_Array;

import java.util.*;
import java.io.*;

public class TakingInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row size ");
        int m = sc.nextInt();
        System.out.println("Enter the coulmn size+ ");
        int n = sc.nextInt();
        int total = m*n;



        int [][] arr = new int[m][n];

        System.out.println("give the total element "+total);

        // Taking Input
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        sc.close();

        System.out.println("print the array");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }



    }
}
