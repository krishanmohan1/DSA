package IntermediateArraysProblem;

import java.util.Scanner;

public class FindUniqueNumberInTheArray {
    static int result(int [] arr ){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;


                }
            }
        }
        int ans = -1;
        for(int i = 0; i < n; i++){
            if(arr[i] != -1){
                ans = arr[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int n = sc.nextInt();
        System.out.println("Enter te arrya input ");
        int arr_1 [] = new int[n];
        for(int i = 0; i < n; i++){
            arr_1[i] = sc.nextInt();

        }

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println("the required answer :  "+ result(arr_1));

    }
}
