package Loop;
import java.util.Scanner;


public class OneToNByForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter upto which you have to print : ");
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            System.out.println(i);
        }
        }
    }

