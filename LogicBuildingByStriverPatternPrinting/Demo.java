package LogicBuildingByStriverPatternPrinting;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Demo {
    public static void print1(int n){
        for(int i = 0; i < n;i++){
            for(int j = 0 ; j < n ; j++ ){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    public static void print2(int n){
        for(int i = 0; i < n;i++){
            for(int j = 0 ; j <= i ; j++ ){ // jitna column no. hai utna he star print hoga .
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    public static void print3(int n){  // similar to right angled triangle , here printing is the colukn no., there was *.
        for(int i = 1; i <= n ;i++){
            for(int j = 1; j <= i;j++ ){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void print4(int n){
        for(int i = 1; i <= n ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void print5(int n){
        for(int i = 0; i < n; i++){
            for(int j =0;j<n-i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    public static void print6(int n){
        for(int i = 0 ; i < n ; i++){
            for(int j = 1 ; j <=n-i;j++){  // es type me logic j loop  me (n-i) agar i=0 hai , nhi to i=1 hai to logic (n-i+1)
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void print7(int n){
        for(int i = 0 ; i < n ; i++){
            //space
            for(int j = 0; j < n-i-1;j++){
                System.out.print(" ");
            }

            // star

            for(int j = 0 ; j < 2*i+1; j++){
                System.out.print("*");
            }

            //space
            for(int j = 0; j < n-i-1;j++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    public static void print8(int n ){
        for(int i = 0 ; i< n ; i++){
            // space

            for(int j = 0 ; j <i;j++ ){
                System.out.print(" ");
            }
                // star
            for(int j = 0; j< 2*(n-i)-1;j++){
                System.out.print("*");
            }


                // space
            for(int j = 0 ; j <i;j++ ){
                System.out.print(" ");
            }

            System.out.println();
        }
    }




    /*
    Pattern 9 is combination of pattern 7 and pattern 8 , donot try to code it , just print pattern7 and pattern 8 one by one .
     */

    public static void print10(int n ){
        for(int i = 1;i <= 2*n-1;i++){
            int star = i;
            if(i>n){
                star=2*n-i;
            }
            for(int j = 1;j<=star;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // it is for no. of test cases.
        for(int i = 0 ; i < t ; i++){
            int n = sc.nextInt();
            print10(n);
        }
    }
}
