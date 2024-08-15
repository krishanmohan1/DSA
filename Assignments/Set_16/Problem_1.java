package Assignments.Set_16;

// Print only Positive value present in the array.

class print_Positive {
    static void func(){
        int arr [] = {2,6,-5,-1,0,4,-9};

        // thorugh for each loop.
        for(int ar : arr){
            if(ar>=0){
                System.out.println(ar);
            }
        }


            /* with For loop
            for(int i = 0; i<arr.length;i++){
            if(arr[i]>=0){
                System.out.println(arr[i]);
            }
        } */
    }
}
public class Problem_1 {
    public static void main(String[] args) {
        print_Positive obj = new print_Positive();
        obj.func();
    }



}


