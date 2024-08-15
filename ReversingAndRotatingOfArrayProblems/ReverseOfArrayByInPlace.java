package ReversingAndRotatingOfArrayProblems;

public class ReverseOfArrayByInPlace {

    static void swap(int [] arr , int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void reverseOfArray(int [] arr ){
        int i = 0, j = arr.length-1;
        while(i<j){
            swap(arr, i , j);
            i++;
            j--;
        }

    }

    static void printArray(int [] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] a = {5,8,4,6,3,};
        reverseOfArray(a);
        printArray(a);


    }
}
