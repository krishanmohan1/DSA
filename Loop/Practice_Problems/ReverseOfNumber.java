package Loop.Practice_Problems;
import java.util.Scanner;


public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // Reverse Of A number.

        int n = sc.nextInt();
        int ans=0;
        int Original_n=n;


        while(n>0) {


            ans = ans * 10 + (n % 10);
            n = n / 10;
        }
        System.out.println(ans);


    }


}
