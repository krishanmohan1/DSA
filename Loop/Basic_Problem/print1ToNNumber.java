package Loop;
import java.sql.SQLOutput;
import java.util.Scanner;


public class print1ToNNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number where you want to start  : ");
        int num = sc.nextInt();
        System.out.println("Enter till which you want to print :  ");
        int n = sc.nextInt();

        while(num<=n){ // it will print untill this condition get false
            System.out.println(num*5);
            num++;

        }



    }
}
