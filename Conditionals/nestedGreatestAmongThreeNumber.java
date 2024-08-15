package Conditionals;
import java.util.Scanner;
// Greatest of three number  without using logical operators.


public class nestedGreatestAmongThreeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a : ");
        int a =sc.nextInt();
        System.out.println("Enter value of b : ");
        int b = sc.nextInt();
        System.out.println("Enter value of c :  ");
        int c = sc.nextInt();

        // maan lo a,b,c

        if(a>b){
            if(a>c){
                System.out.println(a +" is the greatest ");
            }else {
                System.out.println(c +" is the greatest" );
            }
        }else{
            if(b>c){ // a<b
                System.out.println(b+" is the greatest ");
            }else{// ye tan hoga jab c>b hoga
                System.out.println(c+" is the greatest");
            }
        }
    }
}
