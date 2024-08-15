package Rough_Practice;

public class minimum_value {

    static int res(int [] arr){
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
//

        }
        return min;

    }
    public static void main(String[] args) {
        int [] arr = {-5,-9,-6,-8,-5,5,8,9,6,5};
       int  min = res(arr);
        System.out.println(min);

    }
}
