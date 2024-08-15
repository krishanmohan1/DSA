package Outside_package;


import Java_Method.pacakage.*;

import java.sql.SQLOutput;

public class outsidePwSkills  {
    public static void main(String[] args) {
        App obj = new App();

        System.out.println("outside Package, non-Child class: "+obj.Str_1);
        App3 obj3 = new App3();
        System.out.println("Outside package, child class : "+obj3.Str_1);
    }
}
//child class     //parent class
class App3 extends App{
    void printFromChildClass(){
        App obj = new App();
        System.out.println("child class " + obj.Str_1);
    }


}
