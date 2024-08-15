package Sorting_Based_Problems_Arrays;

public class Arrange_EvenFirst_Then_OddLater {
    public static void main(String[] args) {
        int [] arr = {2,5,8,4,3,5,6};
        sort(arr);
        printArray(arr);
    }
    static void printArray(int [] arr){
        for(int i = 0; i < arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    static void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void sort(int arr[]){
        int n = arr.length;
        int left = 0, right = n-1;
        while(left<right){
            if(arr[left]%2!=0 && arr[right]%2==0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2!=0){
                right--;

            }
        }
    }
}
