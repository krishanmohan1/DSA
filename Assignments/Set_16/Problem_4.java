package Assignments.Set_16;

public class Problem_4 {

    static void res(int [] arr){
        int min = arr[0];
        for(int i = 0; i < arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min);;

    }
    public static void main(String[] args) {
        int [] arr = {5,6,8,9,4,4,9,54,6,5};
        res(arr);
//        System.out.println(m);
    }
}
