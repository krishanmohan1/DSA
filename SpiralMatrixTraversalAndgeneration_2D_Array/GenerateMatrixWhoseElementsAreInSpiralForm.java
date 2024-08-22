package SpiralMatrixTraversalAndgeneration_2D_Array;

import java.util.Scanner;

public class GenerateMatrixWhoseElementsAreInSpiralForm {

    public static void printMatrix(int [][]nums){
        for(int i = 0 ; i < nums.length; i++){
            for(int j = 0 ; j<nums[i].length;j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }

    }

    static int [][] generateSpiral(int n){

        int [][] matrix = new int[n][n];
        int toprow = 0, rightcol = n-1, bottomrow = n-1, leftcol = 0, curr = 1;

        while(curr <= n * n){
            // toprow  -> leftcol to rightcol
            for(int j = leftcol; j <= rightcol && curr <= n*n;j++){
                matrix[toprow][j] = curr++;
            }
            toprow++;

            // rightcol -> toprow to bottomrow

            for(int i = toprow ; i <= bottomrow && curr <= n*n;i++){
                matrix[i][rightcol] = curr++;

            }
            rightcol--;

            // bottomrow -> rightcol to leftcol
            for(int j = rightcol ; j >= leftcol && curr <= n*n;j--){
                matrix[bottomrow][j]=curr++;
            }
            bottomrow--;

            // leftcol -> bottomrow to toprow

            for(int i = bottomrow ; i >= toprow && curr <= n*n;i--){
                matrix[i][leftcol]=curr++;
            }
            leftcol++;


        }
        return matrix;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of matrix: ");
        int n = sc.nextInt();
        int [][] spiralMatrix = generateSpiral(n);
        System.out.println("here is the matrix: ");
        printMatrix(spiralMatrix);

    }
}
