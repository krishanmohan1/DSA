package Assignments.Set_3;
import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;


public class Problem_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first no.: ");
        int x=sc.nextInt();
        System.out.println("Enter the second no.: ");
        int y=sc.nextInt();
        System.out.println("Before Swapping");
        System.out.println(x+"," +y);

        //if x=2,y=3
        x=x+y;  //x=2+3=5
        y=x-y;  //y=5-3=2
        x=x-y; // x=5-2=3
        System.out.println("After Swapping");
        System.out.println("x=" +x);
        System.out.println("y=" +y);



    }
}
