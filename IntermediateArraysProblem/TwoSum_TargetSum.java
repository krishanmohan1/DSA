package IntermediateArraysProblem;
import java.util.Scanner;
public class TwoSum_TargetSum {
    static int twosum(int [] arr , int target ){
        int count = 0;
        int n = arr.length;
        for(int i = 0 ; i < n; i++){
            for(int j = i+1; j<n; j++){
                if(arr[i] + arr[j] == target){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give the target");
        int target = sc.nextInt();
        System.out.println("give size of array");
        int n = sc.nextInt();
        int [] arr_1 = new int[n];
        System.out.println("give array input");
        for(int i = 0; i < arr_1.length;i++){
            arr_1[i]=sc.nextInt();
        }
        System.out.println("reuired answer : " + twosum(arr_1,target));
    }
 }
