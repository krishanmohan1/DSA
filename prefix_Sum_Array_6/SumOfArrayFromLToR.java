package prefix_Sum_Array_6;

import java.util.Scanner;

public class SumOfArrayFromLToR {

    static int[] prefix(int [] arr){
        int n = arr.length;
        for(int i = 1; i < n ; i++){
            arr[i] = arr[i-1] + arr[i];

        }
        return arr;

    }

    static void printArray(int [] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size: ");
        int n =  sc.nextInt();
        int [] arr = new int[n+1];
        System.out.println("enter the array : ");
        for(int i = 1; i <= n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("original array: ");
        printArray(arr);

        int [] prefix = prefix(arr);
        printArray(prefix);

        System.out.println("Enter numer of queries");
        int q = sc.nextInt();


        while(q-- >0){

            int l = sc.nextInt();
            int r = sc.nextInt();

            int ans = prefix[r]- prefix[r-1];

            System.out.println("sum "+ans);
        }
        

    }
}
