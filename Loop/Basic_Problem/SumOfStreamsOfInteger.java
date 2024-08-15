package Loop;
import java.util.Scanner;

public class SumOfStreamsOfInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum =0;

//        while (num!=-1){
//            sum+=num;
//            num=sc.nextInt();
//        }

        do{
            sum+=num;
            num=sc.nextInt();
        }while(num!=-1);

        // yaha agar first input -1 doge to bhi ek baar print karega aur sum -1 dega na


        System.out.println(sum);
    }
}
