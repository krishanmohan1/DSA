package RECURSION_7_LinearSearchOnArray;

public class CheckIsSortedOrNot {
    static boolean isSorted(int [] arr, int idx){

        // Base Case
        if(idx == arr.length-1) return true;

        // Self Work
        if(arr[idx]<arr[idx-1]){
            return false;
        }
        // Recursive Work ---> Sub Problem
        return isSorted(arr,idx+1);

    }
    public static void main(String[] args) {
        int [] arr = {1 , 2 , 3 , 7 , 5 , 6};

        if(isSorted(arr,1)){
            System.out.println("Sorted ");
        }else{
            System.out.println("not sorted ");
        }

    }
}
