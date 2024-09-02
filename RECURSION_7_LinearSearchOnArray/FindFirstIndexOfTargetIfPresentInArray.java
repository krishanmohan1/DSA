package RECURSION_7_LinearSearchOnArray;

public class FindFirstIndexOfTargetIfPresentInArray {

//        Return the first index if present in the array otherwise return -1

    static  int findIndex(int arr[] , int n , int target ,int idx){
        // Base Case
        if(idx == n ) return -1;
        // Self Work
        if(arr[idx] == target) return 1;
        // recursive approach -- > sub Probelms
         return findIndex(arr, n , target,idx+1);
    }
    public static void main(String[] args) {
        int [] arr = {2,3,4,5,6,6};
        int target = 78;
        int n = arr.length;
        System.out.println(findIndex(arr,n,target,0));
    }
}
