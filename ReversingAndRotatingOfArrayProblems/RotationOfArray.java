package ReversingAndRotatingOfArrayProblems;
import java.util.*;


public class RotationOfArray {

    static int [] Rotate(int [] arr, int k){
        int n = arr.length;
        k =  k % n;
        int [] ans = new int[n];
        int j =0;
        for(int i = n-k; i < n; i++){
            ans[j++]=arr[i];

        }
        for(int i = 0;i < n-k; i++){
            ans[j++] = arr[i];
        }
        return ans ;
    }

    static void printArray(int [] arr){
        for(int i = 0 ; i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the size of array");
        int a = sc.nextInt();
        int [] arr = new int[a];
        System.out.println("ENter the array element");
        for(int i = 0; i < a; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("array after rotate ");
        Rotate(arr,5);
        printArray(arr);



    }
}
