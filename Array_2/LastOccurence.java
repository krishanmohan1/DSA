package Array_2;

import java.util.Scanner;

public class LastOccurence {

    static int result(int[] arr, int x) {
        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                lastIndex = i;
            }
//            return arr[i];
        }
        return lastIndex;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x elemnet ");
        int x = sc.nextInt();
        System.out.println("enter the arr size: ");
        int n = sc.nextInt();
        int [] arr_1 = new int[n];
        System.out.println("Enter the inputs: ");
        for(int i = 0; i < arr_1.length; i++){
            arr_1[i]=sc.nextInt();
        }
        System.out.println(" answer " + result(arr_1,x));




    }
}
