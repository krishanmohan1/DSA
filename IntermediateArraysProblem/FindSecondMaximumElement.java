package IntermediateArraysProblem;
import java.util.Scanner;
public class FindSecondMaximumElement  {
    static int findMax(int [] arr){
        int n = arr.length;
        int mx = Integer.MIN_VALUE;
        for(int i = 0; i < n; i ++){
            if(arr[i] > mx){
                mx=arr[i];
            }
        }
        return mx;
        }
        static int secondMax(int[] arr){
        int mx = findMax(arr);
            for(int i =0; i < arr.length;i++){
                if(arr[i]==mx){
                    arr[i]=Integer.MIN_VALUE;
                }
            }
            int secondMax = findMax(arr);
            return secondMax;
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
        System.out.println("second max  elment is " + secondMax(arr_1));
    }
}