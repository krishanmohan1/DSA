package Rough_Practice;

public class problem {
    static void res(String [] arr){
        for(int i = 0; i < arr.length; i++){
            if(i%2!=0){
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        String [] arr = {"ab", "bc", "cd", "de", "ef", "fg", "gh"};
        res(arr);

    }
}
