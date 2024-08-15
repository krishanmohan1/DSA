package IntermediateArraysProblem;

import java.util.Scanner;

public class FindMaximumElement {
    static int result(int [] arr){
        int n = arr.length;
        int mx = Integer.MIN_VALUE;  // java me inbuilt hai ye function  for maximum and minimum Integer .
        for(int i = 0; i < n ; i++){
            if(arr[i]>mx){
                mx=arr[i];
            }
        }
        return mx;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = sc.nextInt();
        int [] arr_1 = new int[n];
        System.out.println("Enter the arrya input");
        for(int i = 0; i < arr_1.length; i++){
            arr_1[i] = sc.nextInt();
        }
        System.out.println("Maximum elment is " + result(arr_1));
    }
}
