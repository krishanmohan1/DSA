package prefix_Sum_Array_6;

import java.util.Scanner;

public class CheckPrefixSumISEqualToSuffixSum {
    static int totalSum(int [] arr){
        int count = 0;
        for(int i = 0; i < arr.length;i++){
            count += arr[i];

        }
        return count;
    }

    static boolean check(int arr[]){
        int n = arr.length;
        int totalsum = totalSum(arr);
        int prefixsum=0;
        for(int i = 0 ; i < n ; i++){
           prefixsum += arr[i];
           int suffixsum = totalsum-prefixsum;

           if(prefixsum==suffixsum) return true;

        }
        return false;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elemnets: ");
        for(int i = 0; i < n; i ++ ){
            arr[i]=sc.nextInt();

        }

        boolean a = check(arr);
        System.out.println("possible or not : "+ a);


    }
}
