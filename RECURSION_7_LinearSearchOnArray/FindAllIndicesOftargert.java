package RECURSION_7_LinearSearchOnArray;

public class FindAllIndicesOftargert {

    static void findAllIndices(int [] arr , int n , int target, int idx){
        // base case
        if(idx >= n ) return;

        //self work
        if(arr[idx] == target){
            System.out.println(idx);
        }
        // recursive Work
        findAllIndices(arr, n , target, idx+1);


    }



    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,3,2,2,23,1};
        int n = arr.length;
        int target = 2;
        findAllIndices(arr,n,target,0);
    }
}
