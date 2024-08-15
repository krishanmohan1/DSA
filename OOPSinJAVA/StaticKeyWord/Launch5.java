package OOPSinJAVA.StaticKeyWord;

import java.security.spec.RSAOtherPrimeInfo;

public class Launch5 {

    static int age;


    static {
        System.out.println("static block");
        age=78;

    }
    static void disp(){
        System.out.println("Disp static method ");
        System.out.println(age);
    }
    public static void main(String[] args) {
        System.out.println("Main method");
        Launch5.disp();

    }
}
