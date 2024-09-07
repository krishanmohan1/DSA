package SELECTION_SORT;
public class SelectionSort {
    static void selectionSort(int [] arr){
        int n = arr.length;

        for(int i = 0 ; i < n-1 ; i++){
            // find the minimum element in the unsorted part of array
            int min_index = i ;
            for(int j = i+1; j < n; j++){
                if(arr[j] < arr[min_index]){
                    min_index = j;
                }
            }
            // swap the element with minimum element and the first poisition of min element
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
         }
    }
    public static void main(String[] args) {
        int [] arr = {5,3,7,4,7,3,20};
        selectionSort(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
