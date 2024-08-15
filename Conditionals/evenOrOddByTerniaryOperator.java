package Conditionals;
import java.sql.SQLOutput;
import java.util.Scanner;


public class evenOrOddByTerniaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number : ");
        int num = sc.nextInt();


        // if else ka dushra tarika .. .

        String ans;  // yaha ek answer naam ka string variable banna pada kyu ki ye return string me kar rha hai
        ans = (num%2==0) ? "even" : "odd";
        System.out.println(ans);

    }

}
