package Introduction_To_Arrays;

// find sum of elemnets of array
class sum{
    public void fun() {
        int[] arr = {4, 5, 9, 2}; // sum = 20
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
public class Sum_of_elements_array {
    public static void main(String[] args) {
        sum obj = new sum();
        obj.fun();
    }
}
