package Java_Method;
import java.util.Scanner;
class Algerba{

      Algerba(){ // yaha par constructor banaya gya aur ,
        System.out.println("Constructor of Algebra class called  ");
    }
    int add(int a , int b){
        int ans = a+b ;
        return ans;
}
}
public class SumOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Algerba obj1 = new Algerba();
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Sum of input number is ");

        int ans =  obj1.add(x,y);
        System.out.println(ans);

//        System.out.println(Math.sqrt(24));  // Math class ko use karne ke liye kuch bhi import nhi karna padta hai .
//        System.out.println(Math.sqrt(16));  // Math function Library Double data type value return karta hai .
//
//
//        System.out.println(Math.floor(5.8));
//        System.out.println(Math.floor(5.6));
//
//        System.out.println(Math.ceil(6.8));
//        System.out.println(Math.ceil(6.9));












    }
}
