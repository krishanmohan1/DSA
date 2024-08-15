package Loop;
import java.util.Scanner;


public class ReverseOf10to1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the last no. : ");
        int n = sc.nextInt();


        // ********** with for loop **********
//        for(int num = n; num>=1 ; num--){
//            System.out.println(num);
//        }


        // ***********with while loop**********
//        int num=n;
//        while(num>=1){
//            System.out.println(num);
//            num-=2;


        // ******** with do while *********
        int num = n;
        do {
            System.out.println(num);
            num--;
        }
        while (num >= 1);
    }
}
