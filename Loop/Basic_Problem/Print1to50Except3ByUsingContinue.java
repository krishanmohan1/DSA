package Loop;
import java.util.Scanner;


public class Print1to50Except3ByUsingContinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ********** By for loop*************

//        for(int i = 1; i<=50; i++){
//            if(i%3==0){
//                continue;
//            }
//            System.out.println(i);

        // *********** By while loop **********


        int i = 1;
        while (i <= 50) {
            if (i % 3 == 0) {
                i++;  // yaha ek  baar aur i++ karna padega kyu ki
                      // yaha par 3 par break hone ke baad increment he nhi ho rha hai jab esse dry run karke dekhoge tab
                 continue;

            }
            System.out.println(i);
            i++;
        }
    }
}