package Array_2;
import java.util.*;

public class SmallestAndLargetElement {
    static int[] result(int [] arr){
        Arrays.sort(arr);
        int [] arr_1 = {arr[0], arr[arr.length-1]};
        return arr_1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int [] arr_2 = new int[n];

        for(int i = 0; i < arr_2.length; i++){
            arr_2[i]=sc.nextInt();

        }
        int [] ans = result(arr_2);
        System.out.println("answer " + ans[0] +" "+ ans[1]);


    }
}
