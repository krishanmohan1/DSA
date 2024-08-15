package Assignments.Set_2;
import java.util.Scanner;


public class Problem_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mark_1=sc.nextInt();
        int mark_2=sc.nextInt();
        int mark_3=sc.nextInt();
        int Total_mark=mark_1+mark_2+mark_3;
        float percentage = (Total_mark/3);

        System.out.println("Total marks: "+Total_mark);
        System.out.println("percentage marks: "+percentage+"%");
    }
}
