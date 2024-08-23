package PrefixSumInMatrix_2D;

import java.util.Scanner;

public class SumOfRectangleBetweenTwoCoordinates {

    public static int findSum(int [][] matrix , int l1 , int r1, int l2 , int r2){
        int sum = 0;

        for(int i = l1 ; i <= l2;i++){
            for(int j = r1; j <= r2; j++){
                sum += matrix[i][j];
            }
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row: ");
        int r = sc.nextInt();
        System.out.println("Enter the col: ");
        int c = sc.nextInt();
        int matrix[][] = new int[r][c];
        System.out.println("Enter the total elements: ");
        for(int i = 0 ; i < matrix.length;i++){
            for(int j = 0; j < matrix[i].length;j++){
                matrix[i][j]=sc.nextInt();

            }
        }
        System.out.println("Input Matrix");

        System.out.println("Enter reactangle boundaries l1, r1, l2, r2");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        System.out.println("reactangle sum :"+findSum(matrix,l1,r1,l2,r2));
    }
}
