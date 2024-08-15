package Conditionals;
import java.sql.SQLOutput;
import java.util.Scanner;


public class areaAndPerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length :  ");
        int length = sc.nextInt();
        System.out.println("Enter breadth : ");
        int breadth = sc.nextInt();

        int area = length*breadth;
        int perimeter = 2*(length+breadth);
        if(area>perimeter){
            System.out.println("The area is greater than perimeter");
        }
//        if(area==perimeter) {
//            System.out.println("The area is equal to perimeter");
//        }
        else {
            System.out.println("The area is not greater than perimeter ");
        }
    }
}
