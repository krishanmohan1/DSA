package Conditionals;
import java.util.Scanner;


public class whoIsYoungest {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Age of ram : ");
        int ram_age = sc.nextInt();
        System.out.println("Age of shyam : ");
        int shyam_age= sc.nextInt();
        System.out.println("Age of ajay : ");
        int ajay_age = sc.nextInt();

        if(ram_age<shyam_age && ram_age<ajay_age){
            System.out.println("Ram is youngest");
        } else if (shyam_age<ram_age && shyam_age<ajay_age) {
            System.out.println("Shyam is youngest ");

        }
        else {
            System.out.println("Ajay is youngest");
        }

    }
}
