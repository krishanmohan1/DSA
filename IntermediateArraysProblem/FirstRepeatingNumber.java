package IntermediateArraysProblem;
import java.util.Scanner;
public class FirstRepeatingNumber {
    static int firstRepeated(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i]==arr[j]){
                    return  arr[i];
                }
            }
        }
        return -1;
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
//        int y = firstRepeated(arr_1);
        System.out.println("First Repeated number is : " + firstRepeated(arr_1));
//        System.out.println("Requires array is : " + arr_1[y]);

    }
}
