package RECURSION_6_On_Array;

public class FindingMaxInArray {

    static int printMax(int [] arr , int idx){
        // base case
        if(idx== arr.length-1){
            return arr[idx];
        }
        // sub Problem -> recursive works -> Max of idx+1 to n-1
        int smallAns = printMax(arr , idx+1);

        // self work --> comaprea the max in smallAns and ar[idx]
        return  Math.max(arr[idx],smallAns);
    }
    public static void main(String[] args) {
        int [] arr = {13,544,86,34};
        System.out.println(printMax(arr,0));
    }
}
