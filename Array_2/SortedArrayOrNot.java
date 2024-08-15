package Array_2;

import java.util.Scanner;

public class SortedArrayOrNot {
    static boolean result(int arr[] ){
        boolean check = true;
        for(int i = 1; i < arr.length; i ++){
            if (arr[i]<arr[i-1]) {
                check = false ;
                break;

            }
        }
        return check;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int [] arr_1 =  new int[x];
        for(int i =0; i < arr_1.length ; i++){
            arr_1[i]=sc.nextInt();


        }
        System.out.println("IsSorted or nor :  " + result(arr_1));

    }
}
