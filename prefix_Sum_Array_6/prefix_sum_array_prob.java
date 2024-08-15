package prefix_Sum_Array_6;
import java.util.*;

public class prefix_sum_array_prob {

    // this method is creating a new array , space complexity increases
    public static int[] makePrefixArray(int[] arr){
        int n = arr.length;
        int [] pref = new int[n];
        pref[0] = arr[0];
        for(int i = 1 ; i < n ; i++){
            pref[i] = pref[i-1]+arr[i];
        }
        return pref;

    }

    public static int[] makePrefixWithoutNewArray(int [] arr){
        int n = arr.length;
        for(int i = 1 ; i < n ; i ++){
            arr[i]=arr[i-1]+arr[i];

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
        int [] arr = new int[n];
        System.out.println("enter the array : ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("original array: ");
        printArray(arr);

       int [] pref =  makePrefixArray(arr);
       int [] ar = makePrefixWithoutNewArray(arr);

       printArray(ar);

    }
}
