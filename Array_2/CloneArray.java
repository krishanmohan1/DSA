package Array_2;

import java.util.Scanner;
public class CloneArray {
    static void printArray(int [] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n = sc.nextInt();
        int arr_1[] = new int[n];
        System.out.println("enter input of array");
        for(int i = 0; i< arr_1.length  ;i++){
            arr_1[i]=sc.nextInt();
        }
        System.out.println("original array");
        printArray(arr_1);
        // creating of new array by cloning of arr_1
        int arr_2[] =  arr_1.clone();
        System.out.println("Cloned array ");
        printArray(arr_2);
        // previous_array.clone() is a method to clone a array
        // Making changes into array
        arr_2[0]= 56;
        arr_2[1]= 96;
        System.out.println("Original array after changing");
        printArray(arr_1);
        System.out.println("Cloned array after changig");
        printArray(arr_2);






    }
}
