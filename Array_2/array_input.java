package Array_2;
import java.util.Scanner;
public class array_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n = sc.nextInt();
        int [] array = new int[n];
        System.out.print("Enter your input ");
        for(int i=0; i<array.length;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("printing input ");
        for(int i = 0; i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}







