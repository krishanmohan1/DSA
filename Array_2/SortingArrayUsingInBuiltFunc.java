package Array_2;
import java.util.*;
public class SortingArrayUsingInBuiltFunc {

    static void result(int arr[]){

        // Arrays.sort() is method to short a array , it is inbuilt.
         Arrays.sort(arr);
         for(int i = 0; i< arr.length;i++){
             System.out.println(arr[i]);
         }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr_2 [] = new int[5];
        for(int i = 0; i < arr_2.length; i++){
            arr_2[i]=sc.nextInt();
        }
        result(arr_2);
    }
}
