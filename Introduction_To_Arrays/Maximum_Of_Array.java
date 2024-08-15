package Introduction_To_Arrays;

// find the maximum elemnet oof the given array

class maximum{
    public void func(){
        int [] arr = {5,4,0,2,8,12};
        int max = arr[0]; // esko let kiye hai .
        for(int i = 0; i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
//            System.out.println(max); yaha galat jagah print kar rahe the ..
        }
        System.out.println("max " + max);
    }
}
public class Maximum_Of_Array {
    public static void main(String[] args) {
        maximum obj = new maximum();
        obj.func();

    }
}
