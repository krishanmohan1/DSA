package PracticeProbem2DArray_transpose_rotation_pascals;

import java.util.Scanner;

public class TransPoseOfMatrix {

    public static void printArray(int [][]nums){
        for(int i = 0 ; i < nums.length; i++){
            for(int j = 0 ; j<nums[i].length;j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }

    }

    public static int [][] tranpose(int [][] nums , int r , int c){

        int [][] trans = new int[c][r];

        for(int i = 0 ; i < c;i++){
            for(int j = 0 ; j < r;j++){
                trans[i][j]=nums[j][i];
            }
        }
        return trans;
    }

    public static void transposeInPlace(int [][] matrix , int r , int c){
        for(int i  = 0 ; i < c; i ++){
            for(int j = i ; j < r;j++){  // yha par j = i se shuru karenge , twice swap hone se bachne ke liye .
                // swap kar denge matrix[i][j] , matrix[j][i]
                int temp = matrix[i][j];
                matrix[i][j]= matrix[j][i];
                matrix[j][i]=temp;

            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row and colum no: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int [][] matrix = new int[r][c];
        int total = r*c;
        System.out.println("ENter the "+ total+"elements");
        for(int i = 0 ; i < r ; i++){
            for(int j = 0 ; j < c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Input Matrix: ");
        printArray(matrix);

        System.out.println("transpose of matrix");

        transposeInPlace(matrix, r, c);
        printArray(matrix);
//        int [][] ans =   tranpose(matrix,r,c);
//        printArray(ans);



    }
}
