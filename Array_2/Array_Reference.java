package Array_2;

import java.util.Scanner;

public class Array_Reference {

//    // here is new example of refrence array
//    static void change_Array(int [] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = 0;
//        }
//
//
//        int[] A = new int[3];
//        A[0] = 1;
//        A[1] = 3;
//        A[2] = 5;
//
//        for(int i = 0; i < A.length;i++){
//            System.out.println(A[i]);
//        }
//    }






    static void printArray( int[] arr){
        for(int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array ");
        int n = sc.nextInt();
        int arr_1 [] = new int[n];

        System.out.println("enter your inputs");

        for(int i = 0; i < arr_1.length; i++){
            arr_1[i] = sc.nextInt();

        }

//        arr_1[0]=1;
//        arr_1[1]=2;
//        arr_1[2]=3;
//        arr_1[3]=4;
//        arr_1[4]=5;
        System.out.println("Orginal array");
        printArray(arr_1);

        // creating new array , and reffering to previous array
        int arr_2[]=arr_1;

        System.out.println("Copied or referenced array");
        printArray(arr_2);
        arr_2[0]=8;
        arr_2[1]=6;

        System.out.println("Orginal array after chaging ");
        printArray(arr_1);
        System.out.println("Copied array after changing ");
        printArray(arr_2);






    }
}
