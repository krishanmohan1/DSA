package Loop.Pattern_Printing;

// printing hollow rectangle , but it is not working

import java.util.Scanner;

class hollow_rectangle{
    void func(){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        for(int i =1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(i==1 || i==r || j==1 || j==c){
                    System.out.print("*");}

                else{
                    System.out.print(" ");}




            }
            // yaha i iteration khatam hota hai, to yaha par lagega change line iteration.
            System.out.println();
        }

    }
}

public class printing_hollow_rectangle {
    public static void main(String[] args) {
        hollow_rectangle obj= new hollow_rectangle();
        obj.func();

    }
}
