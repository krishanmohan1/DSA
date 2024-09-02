package RECURSION_7_LinearSearchOnArray;

public class FindTargetIsPresentOrNot {

    static boolean findTarget(int [] arr , int target, int idx){
        // base case
        if(idx == arr.length) return false;

        // sub problem -> recursive work
        boolean p = findTarget(arr,target,idx+1);

        // self work
        if(arr[idx]==target) return true;
        return p;
    }
    public static void main(String[] args) {
        int [] arr = {12,34,65,1,2,3};
        int target = 0;

        System.out.println(findTarget(arr,target,0));
    }
}
