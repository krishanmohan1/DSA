package IntermediateArraysProblem;
import java.util.*;

public class ThreeSum_TripletSumTraget {

    static int result(int[] arr , int target ){
        int count = 0;
        int n = arr.length;

        for(int i = 0; i < n; i++){ // first number
            for(int j = i + 1; j < n; j++){ // second
                for(int k = j + 1; k < n; k++){ // third num
                    if(arr[i] + arr[j] + arr[k] == target){
                        count ++;

                    }
                }
            }
        }
        return count;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the target ");
        int target = sc.nextInt();
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int arr_1 [] = new int[n];
        System.out.println("enter the array input ");
        for(int i = 0; i < arr_1.length; i++){
            arr_1[i] = sc.nextInt();
        }

        System.out.println("Required answer: "+ result(arr_1,target));


    }
}
