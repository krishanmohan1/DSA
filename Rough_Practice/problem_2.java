package Rough_Practice;

public class problem_2 {

    static void res(int [] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        int arr [] = {2,6,7,9,8,5,6,3,48,9,5,4,56,2,15};
        res(arr);
    }
}
