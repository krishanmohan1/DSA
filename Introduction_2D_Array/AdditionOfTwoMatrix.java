package Introduction_2D_Array;
import java.util.Scanner;



public class AdditionOfTwoMatrix {

    public static void mul(int [][]a , int r1 , int c1, int [][]b ,int r2 , int c2){

        if(c1 != r2){
            System.out.println("mulltiplication is not possible ");
            return;
        }

        int mul [][] = new int[r1][c2];
        for(int i = 0 ; i < r1;i++){
            for(int j = 0 ; j < c2; j++){

                for(int k = 0; k < r1;k++){
                    mul[i][j] = a[r1][k] *b[k][c2];
                }

            }

        }
        printArray(mul);
    }
    public static void  sum(int a[][] , int r1 , int c1, int b[][], int r2, int c2){

        if(r1 != r1 || c2 != c2){
            System.out.println("Wrong input - Addition not possible ");
            return;
        }

        int sum[][] = new int[r1][c1];
        for(int i = 0 ; i < sum.length;i++){
            for(int j = 0 ; j < sum[i].length;j++){
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        printArray(sum);


    }
    public static void printArray(int arr[][]){
        for(int i=0; i < arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of first matrix");
        int m1 = sc.nextInt();
        int n1 = sc.nextInt();
        int mat1[][] = new int[m1][n1];
        for(int i = 0 ; i < mat1.length;i++){
            for(int j = 0; j < mat1[i].length;j++){
                mat1[i][j]=sc.nextInt();

            }
        }
        printArray(mat1);

        System.out.println("enter the size of 2nd matrix");
        int m2 = sc.nextInt();
        int n2 = sc.nextInt();
        int mat2[][] = new int[m2][n2];

        for(int i = 0 ; i < mat2.length;i++){
            for(int j = 0; j < mat2[i].length;j++){
                mat2[i][j]=sc.nextInt();

            }
        }
        printArray(mat2);



//        int sum[][] = new int[m1][n1];
//        for(int i = 0 ; i < sum.length;i++){
//            for(int j = 0 ; j < sum[i].length;j++){
//                sum[i][j]=mat1[i][j]+mat2[i][j];
//            }
//        }
//        printArray(sum);
        mul(mat1,m1,n1,mat2,m2,n2);









    }
}
