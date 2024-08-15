package Sorting_Based_Problems_Arrays;


import java.util.Scanner;

public class Sort_Array_Of_0s_And_1s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of arr: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("arr: ");
        for(int i = 0; i < n;i++){
            arr[i]=sc.nextInt();

        }
        System.out.print("without swapping: ");
        printArray(arr);
        System.out.println();
        System.out.print("After Swapping: ");
        Optimized_Code(arr);
        printArray(arr);


//        int [] arr = {0,1,0,1,0,1,0,1,0,1};
//        sort(arr);

    }

    static void printArray(int[]arr){
        for(int i = 0; i < arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    static void swap(int [] arr , int i , int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

            // OPTIMIZED CODE
    static void Optimized_Code(int arr[]){
        int n = arr.length;
        int i = 0, j = n-1;
        while (i < j) {

            if (arr[i] == 1 && arr[j] == 0) {
                swap(arr, i, j);
                i++;
                j--;

            }
            if (arr[i] == 0) {
                i++;
            }
            if (arr[j] == 1) {
                j--;
            }
        }

    }



    // GENERAL METHOD
    static void sort(int [] arr){
        int n = arr.length;
        int zero =0;
        for (int i = 0; i < n; i++){
            if(arr[i]==0){
                zero++;
            }
        }
        for(int i = 0; i < n ; i++){
            if(i<zero){
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }
        }
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]);
        }
    }

}
