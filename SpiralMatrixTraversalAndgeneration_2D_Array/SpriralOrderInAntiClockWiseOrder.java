package SpiralMatrixTraversalAndgeneration_2D_Array;

import java.util.Scanner;

public class SpriralOrderInAntiClockWiseOrder {
    public static void printMatrix(int [][]nums){
        for(int i = 0 ; i < nums.length; i++){
            for(int j = 0 ; j<nums[i].length;j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }

    }

    public static void spiralInAntiClockWise(int [][] matrix , int r , int c){
        int toprow = 0, bottomrow =  r-1, rightcol = c-1, leftcol = 0;
        int totalElemnet = 0;
        while(totalElemnet < r * c){

            // leftcol -> toprow to bottomrow
            for(int i = toprow ; i <=bottomrow && totalElemnet < r *c ; i++){
                System.out.print(matrix[i][leftcol]+" ");
                totalElemnet++;
            }
            leftcol++;

            // bottomrow -> leftcol to rightcol
            for(int j = leftcol ; j <= rightcol && totalElemnet < r *c;j++){
                System.out.print(matrix[bottomrow][j]+" ");
                totalElemnet++;
            }
            bottomrow--;

            // rightcol -> bottomrow to toprow
            for(int i = bottomrow; i >=toprow && totalElemnet < r*c ; i--){
                System.out.print(matrix[i][rightcol]+" ");
                totalElemnet++;

            }
            rightcol--;

            // toprow -> rightcol to leftcol
            for(int j = rightcol; j >= leftcol && totalElemnet < r*c;j--){
                System.out.print(matrix[toprow][j]+" ");
                totalElemnet++;
            }
            toprow++;


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
        System.out.println("Spiral Mtarix in Anticlock-Wise: ");
        spiralInAntiClockWise(matrix,r,c);
//        printMatrix(matrix);

    }
}
