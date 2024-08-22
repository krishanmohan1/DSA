package SpiralMatrixTraversalAndgeneration_2D_Array;

import java.util.Scanner;

public class ReturnAllElementsInASpiralMatrix {

    public static void printMatrix(int [][]nums){
        for(int i = 0 ; i < nums.length; i++){
            for(int j = 0 ; j<nums[i].length;j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }

    }

    static void printSpriralOrder(int [][] matrix , int r , int c){
        int toprow = 0,rightcol=c-1,bottomrow=r-1,leftcol=0;
        int totalElement = 0;

        while(totalElement < r * c){


            // toprow -> leftcol to rightcol
            for(int j = leftcol ; j <= rightcol && totalElement < r * c; j++){
                System.out.print(matrix[toprow][j]+" ");
                totalElement++;
            }
            toprow++;

            // rightcol -> toprow to bottomrow
            for(int i = toprow ; i <= bottomrow  && totalElement < r*c;i++){
                System.out.print(matrix[i][rightcol]+" ");
                totalElement++;
            }
            rightcol--;

            // bottomrow -> rightcol to leftcol

            for(int j = rightcol ; j >= leftcol && totalElement < r*c;j--){
                System.out.print(matrix[bottomrow][j]+" ");
                totalElement++;
            }
            bottomrow--;

            //leftcol -> bottomrow to toprow

            for(int i = bottomrow ; i >= toprow && totalElement < r*c;i--){
                System.out.print(matrix[i][leftcol]+" ");
                totalElement++;
            }
            leftcol++;
        }



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
        printMatrix(matrix);
        System.out.println("Sprial matrix elements: ");
        printSpriralOrder(matrix,r,c);





    }
}
