package Assignments.Set_16;
// peak element
public class Problem_5 {

    static void res(int [] arr){
//        int peak;
        for(int i = 1; i < arr.length-1; i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                System.out.println(arr[i]);
                break;
//                continue;
            }

        }

    }
    public static void main(String[] args) {
        int [] arr = {1,5,7,9,6,2,2,5,2,1,25,4,1,2,54,1,2,1,4,51};
        res(arr);

    }
}
