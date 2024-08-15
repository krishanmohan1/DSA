package Number_System;
import java.util.Scanner;


// binary to decimal number system

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binary_number = sc.nextInt();
        int ans = 0;
        int power = 1;

        while(binary_number>0){
            ans=ans+((binary_number%10)*power);
            binary_number/=10;
            power*=2;

        }
        System.out.println(ans);
    }
}
