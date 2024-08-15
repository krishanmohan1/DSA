package Loop.Practice_Problems ;
import java.util.Scanner ;

        // calculate a to the power b.

public class RaisePower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int a = sc.nextInt() ;
        int ans=1 ;
        int base =sc.nextInt() ;

        for(int i =1 ;i>=base ;i++){
            ans=ans*a;


        }
        System.out.println(ans);


    }
}
