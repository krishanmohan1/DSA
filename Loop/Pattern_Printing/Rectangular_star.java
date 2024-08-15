package Loop.Pattern_Printing;

// priintiing a rectangle star  of r =3, c=6

import java.util.Scanner;

class star{
    void func(){
        for(int i = 1; i<=3; i++){
            for(int j = 1; j<=6; j++){
                System.out.print("*"); // yaha par (println) nhi , print likhna hoga .
            }
            System.out.println(); // it is for new line
        }
    }
}


// print a rectangle of star of desired rows 'r'  and desired column 'c'  by user .

class star_2{
    void func_2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows: ");
        int r = sc.nextInt();
        System.out.println("Enter coulmn: ");
        int c = sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                System.out.print("*");
            }
            System.out.println(); // its is for new line

        }

    }
}

public class Rectangular_star {
    public static void main(String[] args) {

        star obj = new star();
        obj.func();

        star_2 obj_2 = new star_2();
        obj_2.func_2();




    }
}
