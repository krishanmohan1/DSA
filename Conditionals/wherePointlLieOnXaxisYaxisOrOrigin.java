package Conditionals;

// given a point(x,y) , write a program to find out if it lies on
// x-axis , y-axis, or at origin .

import java.util.Scanner;


public class wherePointlLieOnXaxisYaxisOrOrigin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x coordinate:  ");
        int x= sc.nextInt();
        System.out.println("Enter y coordinate:  ");
        int y = sc.nextInt();

        // this nested if else
        // you can also use normal if else ladder

        if (x==0 && y==0){
            System.out.println(" point at origin");
        }else{
            if(x==0){
                System.out.println("point on x aisx");
            }else if(y==0){
                System.out.println("point is on y axis");
            }else{
                System.out.println("pont is in any quadrants");
            }
        }
    }
}

