package RECURSION_6_On_Array;



public class PrintingElementsOfArray {

    static  void printArray(int [] arr, int idx){

        // base case
        if(idx == arr.length) return;
        // self work
        System.out.print(arr[idx]+" ");
        // sub-problem recursive work
        printArray(arr,idx+1);

    }
    public static void main(String[] args) {
        int arr [] = {2,4,6,8,54,3};
        int idx = 0;
        printArray(arr,idx);
    }
}
