package Loop.Pattern_Printing;

// reversed right angled triangle

import java.sql.PseudoColumnUsage;
import java.util.Scanner;

class reverse_triangle{
    void func(){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        for(int i =1; i<=r;i++){
            for(int j=1;j<=(r+1-i);j++){
                System.out.print("*");
            }
            // ye jo ek line chhorte hain ye bahut important hain , sahi se daale
            System.out.println();
        }
    }

}

class second_method{
    void func_2(){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        for(int i = r;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.println("*");
            }
            System.out.println();

        }


    }
}

public class reversed_right_angled_triangle {
    public static void main(String[] args) {
        reverse_triangle obj = new reverse_triangle();
        second_method obj_2 = new second_method();
        obj.func();
        obj_2.func_2();


    }
}
