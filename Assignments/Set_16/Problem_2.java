package Assignments.Set_16;

// Print all string of odd indices.
class convert{
    void func(){
        String [] arr = {"ab","bc","cd","de","ef","fg","gh"};
        for(int i = 1; i<arr.length;i++){
            if(i%2!=0){
                System.out.println(arr[i]);
            }
        }
    }
}
public class Problem_2 {
    public static void main(String[] args) {
        convert obj = new convert();
        obj.func();
    }
}
