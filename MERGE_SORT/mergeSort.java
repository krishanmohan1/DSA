package MERGE_SORT;

public class mergeSort {

    static void printArray(int [] arr){
        for(int val : arr){
            System.out.print(val+" ");
        }
    }

    static void merge(int [] arr , int l, int mid , int r){

        // creating the length of two sorted array left and right
        int n1 = mid-l+1;
        int n2 = r-mid;

        int [] left = new int[n1];
        int [] right = new int[n2];


        // make two array from the main array
        int i , j , k;
        for(i = 0 ; i < n1;i++) left[i] = arr[l+i];         // yaha l+i    first time me to , i = 0 rahega , j = 0 ragega
        for(j = 0 ; j < n2;j++) right[j] = arr[mid+1+j];    // yaha mid+1+j  lo samajhiye , like jab array rrcursively break down hote raheg to accurate size nikalne ke liye

        i = 0 ;
        j = 0;
        k = l;

        // two sorted array left and right dono se , main array me value sorted form me pu kar rahe hain

        while(i < n1 && j < n2){
            if(left[i] <right[j])
                arr[k++] = left[i++];
            else
                arr[k++] = right[j++];
        }

        // jab koi ek array khatam ho jaye to dushre array ke bache hue element ko arr me pu kar denge
        while(i<n1){
            arr[k++] = left[i++];
        }
        while (j < n2){
            arr[k++] = right[j++];
        }
    }

    static void mergeSort(int [] arr , int l , int r ){
        // base case
        if(l>=r) return;
        int mid = (l+r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);


    }


    public static void main(String[] args) {
        int [] arr = {4,2,3,1,5};

        int n = arr.length;
        int l = 0;
        int r = n-1;
        System.out.println("before sorting");
        printArray(arr);
        System.out.println();
        System.out.println("After Sorting");
        mergeSort(arr,l,r);
        printArray(arr);

    }
}
