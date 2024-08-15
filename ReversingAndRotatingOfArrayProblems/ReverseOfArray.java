package ReversingAndRotatingOfArrayProblems;
public class ReverseOfArray {
    static int [] reverseArray(int [] arr){
        int n = arr.length;
        int ans[] = new int[n];
//

//        // By while loop
//        int i = n-1,j=0;
//        while(i>=0){
//            ans[j++]=arr[i--];
//        }
        int j =0;
        for(int i = n-1; i >= 0; i-- ){
            ans[j] = arr[i]; // ans[j++]=arr[i]
            j++;
        }
        return ans;
    }
    static void printArray(int [] arr){
        int n = arr.length;
        for(int i =0; i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {

        int a[] = {2,3,4,5,6};

        int ans [] = reverseArray(a);
        printArray(ans);
    }
}
