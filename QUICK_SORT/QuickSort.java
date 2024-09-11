package QUICK_SORT;

public class QuickSort {
    static void display(int [] arr){
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    static void swap(int [] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int [] arr, int st, int end){
        int pivot = arr[st];
        int cnt = 0 ;
        for(int i = st+1;i<=end;i++){
            if(arr[i] <= pivot) cnt++;
        }
        int pivotIdx = st+cnt;
        swap(arr,st,pivotIdx);
        int i = st,j = end;

        // smaller element then the pivot element on the left and larget element on the right of pivot element
        
        while( i < pivotIdx && j > pivotIdx){
            while(arr[i] <= pivot) i++;
            while (arr[j] >pivot) j--;
            if(i < pivotIdx && j > pivotIdx){
                swap(arr,i,j);
                i++;

                j--;
            }
        }
        return pivotIdx;

    }

    static void quickSort(int [] arr , int st, int end){
        if(st>=end) return;
        int pi = partition(arr ,st,end);
        quickSort(arr,st,pi-1);
        quickSort(arr,pi+1,end);

    }

    public static void main(String[] args) {
        int arr [] = {2,4,1,8,4,9};
        System.out.println("Before Sorting");
        display(arr);
        System.out.println();
        quickSort(arr,0,arr.length-1);
        System.out.println("After Sorting");
        display(arr);

    }
}
