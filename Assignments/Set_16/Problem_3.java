package Assignments.Set_16;

// using for each loop , print even elemnets
class traverse{
    void func(){
        int arr [] = {1,2,3,4,5,6,7,8};
        for(int ar : arr){  // traversing using for each loop
            if(ar%2==0){
                System.out.println(ar);
            }
        }
    }
}
public class Problem_3 {
    public static void main(String[] args) {
        traverse obj = new traverse();
        obj.func();
    }
}
