package Conditionals;
import java.util.Scanner;


// If the age of ram , shyam and ajay are input through the keyboard
// , write a program to determine the youngest of thr three.
// do it using nested if-else and not using (&& || )

public class home_Work_1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Ram age : ");
        int ram = sc.nextInt();
        System.out.println("Shyam age: ");
        int shyam = sc.nextInt();
        System.out.println("Ajay age : ");
        int ajay = sc.nextInt();

        // maan lo ram , shyam, ajay

        if(ram<shyam){
            if(ram<ajay){
                System.out.println(ram+" is youngest");
            }
            else{
                System.out.println(ajay+" youngest");
            }
        }else{ //
            if(shyam<ajay){
                System.out.println(shyam + " is the youngest ");
            }else{
                System.out.println(ajay+ " is the youngest");
            }
        }


    }
}
