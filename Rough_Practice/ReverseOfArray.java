

package Rough_Practice;
public class ReverseOfArray{
    static int [] res(int arr []){
        int n = arr.length;
        int [] ans = new int [n];
        int j = 0;
        // By while loop

//        int i = n-1;
//        while(i>=0){
//            arr[j++]=arr[i--];
//        }


        for(int i = n-1; i >= 0; i--){
            ans[j]=arr[i];
            j++;


        }
        return ans ;
    }

    static void printArray(int [] arr){
        for(int i = 0 ; i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int [] arr = {8,9,45,6,7,4,6,99};
        int ans [] = res(arr);
        printArray(ans);

    }
}