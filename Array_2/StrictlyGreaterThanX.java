package Array_2;

import java.util.Scanner;

public class StrictlyGreaterThanX {
    static int result(int [] arr , int x){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > x){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("comparing element ");
        int x = sc.nextInt();
        System.out.println("Size of array");
        int n = sc.nextInt();

        System.out.println("Inputs of array");
        int arr_1 [] = new int[n];
        for(int i = 0; i < arr_1.length; i++){
            arr_1[i] = sc.nextInt();


        }
        System.out.println("No of elements greater than x : " + result(arr_1,x));
    }
}

