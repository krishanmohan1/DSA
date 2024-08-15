package Rough_Practice;
import java.util.Scanner;
public class SORTING_ARRAY_OF_0s_1s_ONLY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter the array: ");
        for(int i = 0; i < n; i++){
            arr[i]=sc.nextInt();
        }
//        sort(arr);
        optimized(arr);
        printArray(arr);
    }

    static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void optimized(int [] arr){
        int n = arr.length ;
        int a = 0, b = n-1 ;
        while(a<b){
            if(arr[a] == 1 && arr[b]==0){
                swap(arr,a,b);
                a++;
                b--;
            }
            if(arr[a]==0){
                a++;
            }
            if(arr[b]==1){
                b--;
            }

        }


    }



    static void sort(int arr[]){
        int n = arr.length;
        int zero = 0;
        for(int i = 0; i < n; i++){
            if(arr[i]==0){
                zero++;
            }
        }
        for(int i = 0; i < n; i++){
            if(i<zero){
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }
        }
    }
    static void printArray(int [] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}
