package OOPSinJAVA.Inheritance;

class Human{  // super class // parent class // base class
    int age ;

    void sleep(){
        age = 18;
        System.out.println("Human need sleep");
        System.out.println(age);
    }
}
class Student extends Human{ // child class // sub class // derived class
/*
es class me kuch bhi nhi likha hai but 'extends' word se ye child class ban gya hai ,
 jisse ye parent class ka property and behaviour inherit karega
 */
}
public class Inheritance1 {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.sleep();

    }
}
