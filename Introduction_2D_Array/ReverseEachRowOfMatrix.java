package Introduction_2D_Array;

public class ReverseEachRowOfMatrix {

    public static void printArray(int [][]a ){
        for(int c[]:a){
            for(int b :c){
                System.out.print(b+" ");
            }
        }
        System.out.println();
    }

    public static void swap(int a[], int i , int j){
        int temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    public static int[][] reverseRow(int [][]a){

        for(int i = 0 ; i < a.length;i++){
            int left = 0 , right = a[i].length-1;
            while(left<right){
                swap(a[i],left,right);
            }

        }
        return a;

    }

    public static void main(String[] args) {

        int [][] a = {{1,2,3}, {5,3,7},{8,9,6}};
        int [][] res = reverseRow(a);
        printArray(res);

    }
}
