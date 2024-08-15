//package Rough_Practice.Array2SelfPractice;
//
//import java.util.*;
//
//public class ReverseOfArray {
//
//    static int[] reverse(int [] arr){
//        int n = arr.length;
//        int [] ans = new int[n];
//        int j =0;
//        for(int i = n-1; i >= 0; i++){
//            ans[j++]=arr[i--];
//
//        }
//        return ans;
//    }
//    static void printArray(int [] arr){
//        for(int i = 0; i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int [] arr = new int[n];
//        for(int i = 0; i < n; i++);{
//            arr[i]=sc.nextInt();
//        }
//
//
//
//        System.out.println(reverse(arr));
//        printArray(arr);
//
//
//    }
//}
