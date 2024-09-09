package INSERTION_SORT;

public class SortingStringArrayUsingLexicographical {

    static void sort(String arr []){
        for(int i = 0; i < arr.length-1;i++){
            int min = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[j].compareTo(arr[min]) < 0){
                    min = j;
                }
            }
            // swap arr[j] , arr[min]
            if(min != i);
            String temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void main(String[] args) {
        String [] arr = {"mango", "papaya","apple","kiwi"};
        sort(arr);
        for(String o : arr){
            System.out.print(o+" ");
        }
    }
}
