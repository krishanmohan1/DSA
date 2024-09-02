package RECURSION_7_LinearSearchOnArray;

public class LastIndexOfTheTargetInheArray {

    static int lastIndex(int arr[] , int target, int idx){

        // base condition
        if(idx == arr.length) return -1;

        // Recursive call to search in the rest of the array
        int lastIndex = lastIndex(arr , target , idx+1);

        // If the target is found in the remaining part, return its index
        if(arr[idx] == target)
            return (lastIndex == -1) ? idx : lastIndex;

        return lastIndex;
    }
    public static void main(String[] args) {
        int [] arr = {2,3,4,5,6,6};
        int target = 6;

        System.out.println(lastIndex(arr,target,0));

    }
}
