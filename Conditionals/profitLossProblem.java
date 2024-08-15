package Conditionals;
import java.util.Scanner;


public class profitLossProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the cost price : ");
        float cost_price = sc.nextFloat();
        System.out.println("Enter the selling price : ");
        float selling_price=sc.nextFloat();
        float profit_ = selling_price - cost_price;
        float loss = cost_price - selling_price;


        if(selling_price>cost_price){
            System.out.println("you are in profit ");
            System.out.println("you have total profit of "+ profit_ );
        }
        else{
            System.out.println("Your are in loss ");
            System.out.println("you have a total loss of "+ loss );
        }
    }
}
