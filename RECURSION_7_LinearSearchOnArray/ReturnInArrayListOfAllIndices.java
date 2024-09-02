package RECURSION_7_LinearSearchOnArray;

import java.util.*;

public class ReturnInArrayListOfAllIndices {

    static List<Integer> printIndices(int [] arr , int n , int target, int idx){
        List<Integer> ans = new ArrayList<>();

        // Base Condition
//        if(idx >= n) return new ArrayList<Integer>();   or
        if(idx >= n) return ans;        // empty Arraylist



//        List<Integer> ans = new ArrayList<>();
        // Self Work
        if(arr[idx] == target){
            ans.add(idx);
        }

        // Recursive Work -- > sub Problems
        List<Integer> smallAns = printIndices(arr,n,target,idx+1);

        ans.addAll(smallAns);
        return ans;

    }
    public static void main(String[] args) {
        int arr [] = { 1,2 ,2,2,2,4,2,4,2,4,2};
        int target = 2;
        int n = arr.length;

        List<Integer> result = printIndices(arr,n,target,0);

        for(Integer i : result){
            System.out.print(i+" ");
        }

    }
}
