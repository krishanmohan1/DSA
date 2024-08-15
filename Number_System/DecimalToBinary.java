package Number_System;
import java.util.Scanner;

// Decimal to Binary

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal_no = sc.nextInt();
        int ans=0;
        int pw=1; // yaha par ye 10 ke power rahega na
        while(decimal_no>0){
            ans = ans + ((decimal_no%2)*pw);
            decimal_no/=2;
            pw*=10;

        }
        System.out.println(ans);
    }
}
