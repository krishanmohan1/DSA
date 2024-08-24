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

    // Calculate row-wise nd column wise sum
    // matix [i][j] = sumrectangle ( (0,0) (i,j) )
    static void findPrefixSumMatrixRow(int [][] matrix){
        int r = matrix.length;
        int c = matrix[0].length;
        // traverse horizontally to calculate row-wise prefix sum
        for(int i = 0 ; i < r;i++){  // fixes column
            for(int j = 1; j<c;j++){
                matrix[i][j]+=matrix[i][j-1];
            }
        }

        // traversing vertically to calculate column-wise prefix sum
        for(int j = 0; j < c;j++){
            for(int i = 1;i<r;i++){
                matrix[i][j] += matrix[i-1][j];
            }
        }
    }



    public static int findSum2(int [][] matrix, int l1, int r1, int l2, int r2){
        int sum = 0;
        findPrefixSumMatrixRow(matrix);

        for(int i = l1;i <= l2;i++){
            //r1 to r2 sum for row i
            if(r1>=1){
                sum+=matrix[i][r2]-matrix[i][r2-1];
            }else{
                sum+=matrix[i][r2];
            }

        }


        return sum;

    }


    public static int findSum3(int [][] matrix , int l1 , int r1, int l2, int r2){
        int ans = 0, sum = 0 , up = 0 , left = 0, leftUp = 0;
        findPrefixSumMatrixRow(matrix);

        sum = matrix[l2][r2];
        if(r1>=1){
            left = matrix[l2][r2-1];
        }
        if(l1>=1){
            up = matrix[l1-1][r2];
        }
        if(l1>=1 && r1>=1){
            leftUp = matrix[l1-1][r1-1];
        }

        ans = sum - up - left + leftUp;



        return ans;
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

//        System.out.println("reactangle sum :"+findSum(matrix,l1,r1,l2,r2));
        System.out.println("reactangle sum :"+findSum3(matrix,l1,r1,l2,r2));

    }
}
