package Conditionals;
import java.util.Scanner;

public class printDayBySwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day no. : ");
        int day = sc.nextInt();

        switch (day){
            case 1:
                System.out.println("it is monday ");
                break;
            case 2:
                System.out.println("It is Tuesday");
                break;
            case 3:
                System.out.println("It is wednesday");
                break;
            case 4:
                System.out.println("it is thursday");
                break;
            case 5:
                System.out.println("it is friday ");
                break;
            case 6:
                System.out.println("it is saturday ");
                break;
            case 7:
                System.out.println("it is sunday");
                break;
            default:
                System.out.println("it is out of 7 days of week5");
        }

    }
}
