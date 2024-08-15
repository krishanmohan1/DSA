package Conditionals;


import java.util.Scanner;

public class sidesOfaTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("1st side : ");
        int side_1=sc.nextInt();
        System.out.println("2nd side : ");
        int side_2=sc.nextInt();
        System.out.println("3rd side : ");
        int side_3=sc.nextInt();
//        if(side_1+side_2>side_3){
//            System.out.println("it can be a traingle");
//        }
//        else if(side_1+side_3>side_2){
//            System.out.println("it can be a triangle");
//        }
//        else if(side_2+side_3>side_1){
//            System.out.println("it can be a triangle");
//        }
//        else{
//            System.out.println("it cann't be a triangle ");
//        }


        // you  can write in just one single statement
        if (side_1+side_2>side_3 && side_2+side_3>side_1 && side_3+side_1>side_2){
            System.out.println("It can be a side of triangle45");
        }
        else {
            System.out.println("invalid triangle");
        }
    }
}
