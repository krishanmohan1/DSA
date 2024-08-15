package PracticeProbem2DArray_transpose_rotation_pascals;

import java.util.Scanner;

public class RotateMatrixBy90DegreeClockwise {

    public static void printArray(int [][]nums){
        for(int i = 0 ; i < nums.length; i++){
            for(int j = 0 ; j<nums[i].length;j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }

    }

    public static void tranposeInPlace(int [][] nums , int r , int c){

        for(int i = 0 ; i < c;i++){
            for(int j = i ; j < r;j++){
                // swap
                int temp = nums[i][j];
                nums[i][j]=nums[j][i];
                nums[j][i]=temp;
            }
        }

    }

    public static void reverseArray(int [] num){
        int  i = 0 , j = num.length-1;
        while(i < j ){
            int temp = num[i];
            num[i]= num[j];
            num[j]=temp;
            i++;
            j--;
        }

    }

    public static void rotate(int [][] matrix , int r){

        // transpose
        tranposeInPlace(matrix, r ,r);

        // reverse each rows of the matrix
        for(int i = 0 ; i < r;i++){
            reverseArray(matrix[i]);
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

        System.out.println("Rotated matrix");
        rotate(matrix,r);

        printArray(matrix);
    }
}
