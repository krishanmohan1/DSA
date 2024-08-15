package Loop;
import java.util.Scanner;

// find first multiple of 5 and 7


public class FindFirstMultipleOf5And7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1;

//        int n = sc.nextInt();
//        int m =sc.nextInt();

        while(true){
            if((num%5==0) && (num%7==0)){
                System.out.println("found num is "+ num);
                break;
                /*
                break key words ka mtlb jab ye pahle goal achive
                kiya tab loop break ho jayega ussi time .
                jaise es condition me jaha 35 mila band ho gya .
                 */
            }
            num++;
        }

       /* esko tum aise bhi bana sakte ho ki 5,7 ke jagah use
        se koi bhi input lo aur usko first common multiple
        find karke do .
        jaise upper me input liya hua hai .
        commented form me .


        loop ka bahut use hai bahut variety ke
        question ban sakte hai .
         */


    }
}
