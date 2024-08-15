package OOPSinJAVA.StaticKeyWord;

import java.util.Scanner;

class Person{
    int principalAmount;
    float time;
    static float rate;
    static
    {
        rate=12;
    }
    // this rate is same for all the person

    /*
    rest thing will vary according to the persons, it for every object it shols be differnt.
     */

    float simpleInterest;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter principal amount: ");
        principalAmount = sc.nextInt();
        System.out.println("Enter the time: ");
        time = sc.nextInt();

    }
    void calculate(){
        simpleInterest=(principalAmount*time*rate)/100f;
    }

    void disp(){
        System.out.println(simpleInterest);
    }
}

public class SimpleInterestcalculator {
    public static void main(String[] args) {

        Person p1 = new Person();
        Person p2 = new Person();

        p1.input();
        p1.calculate();
        p1.disp();

        p2.input();
        p2.calculate();
        p2.disp();


    }
}
