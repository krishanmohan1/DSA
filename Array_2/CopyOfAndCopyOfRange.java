package Array_2;
// import java.util.Arrays;
import java.util.*;

public class CopyOfAndCopyOfRange {

    static void printArray(int [] arr){
        for(int i = 0; i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the size ");
        int n = sc.nextInt();

        // creating an array
        int arr_1[] = new int[n];
        System.out.println("Taking input");
        // taking input
        for(int i = 0; i < arr_1.length; i++){
            arr_1[i] = sc.nextInt();
        }

        System.out.println("Original Array");
        printArray(arr_1);

        // copying of array
        System.out.println("Copying of array");
        int arr_2 [] = Arrays.copyOf(arr_1,arr_1.length);

        System.out.println("Copied array");
        printArray(arr_2);

        // changes in array
        arr_2[0] = 0;
        arr_2[1] = 0;

        // After changes
        System.out.println("Orginal array after changes ");
        printArray(arr_1);
        System.out.println("copied array after changes  ");
        printArray(arr_2);

        // another way of copying array upto a range
                                            //       [      )
        int [] arr_3 = Arrays.copyOfRange(arr_1, 1,5 );
        int [] arr_4= Arrays.copyOfRange(arr_2, 0,4 );
        System.out.println("upto range of index 1 to 4");
        printArray(arr_3);
        System.out.println("upto range of index 0 to 3");

        printArray(arr_4);










    }
}
