package Conditionals;
import java.util.Scanner;


// Question :- Given three points (x1,x2) , (x2,y2) ,(x3,y3).
// write a program to check if all the three points fall on one straight line.


public class threePointsOnALine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x1 = 1, x2 = 2, x3 = 3, y1 = 1, y2 = 2, y3 = 4;
        double m1 = (y2-y1)/(x2-x1);
        double m2 = (y3-y2)/(x3-x2);

        if(m1==m2){
            System.out.println("All points are same line ");
        }
        else{
            System.out.println("points are not onn same line ");
        }



    }
}
