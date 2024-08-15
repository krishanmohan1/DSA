package Conditionals;
import java.util.Scanner;


public class gradePercentageProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the percentage : ");

        int percentage = sc.nextInt();
        if(percentage>90){
            System.out.println("you are excellent ");
        }
        else if (percentage>80){
            System.out.println("you are very good ");
        }
        else if (percentage>70){
            System.out.println("you are good ");
        }
        else if (percentage>60){
            System.out.println("you can do better ");
        }
        else if (percentage>50){
            System.out.println("you are average ");
        }
        else if (percentage>40){
            System.out.println("you are below average ");
        }
        else {
            System.out.println("you are fail ");

        }


    }
}
