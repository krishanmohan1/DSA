package RECURSION_6_On_Array;

public class SumOfElementsOArray {

    static  int printSum(int [] arr , int idx){
        // base case -->
        if(idx == arr.length-1){
            return arr[idx];
        }
        // Sub problem --> sum of array from idx idx + 1
        int smallSum = printSum(arr , idx +1);

        // self work--> add arr[idx] to the smallSum

        return  arr[idx] + smallSum;
    }
    public static void main(String[] args) {
        int [] arr = {2,3,5,7,7};
        System.out.println(printSum(arr,0));
    }
}
