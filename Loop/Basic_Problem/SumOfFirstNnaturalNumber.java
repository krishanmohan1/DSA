package Loop;
import java.util.Scanner;
import java.util.Scanner;


public class SumOfFirstNnaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of n : ");
        int n = sc.nextInt();
        int sum = 0;

        //********* with while loop ***********
//        int num=1;
//        while(num<=n){
//            sum = sum + num;
//            num++;
//        }
//            System.out.println(sum);

        // ********** with for loop ************

        for (int num = 1; num <= n; num++) {
            sum=sum+num;
//            System.out.println(sum);
        }
            System.out.println(sum);

        //******** by do while *************





    }
}
