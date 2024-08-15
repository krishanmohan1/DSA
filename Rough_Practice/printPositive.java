package Rough_Practice;

public class printPositive {

    static void postive(int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i]>=0){
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {2,6,-9,-41,-96,0,7,3};
      postive(arr);

    }
}
