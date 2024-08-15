package OOPSinJAVA.Inheritance;
class Human1{

    private String name;
    int age ;

    Human1(){
        System.out.println("Human class contructor");
    }

    void sleep(){
        age =18;
        System.out.println("Human needs good sleep");
        System.out.println(age);
    }
}

class Student1 extends Human1{

    /*
    yaha par default student1 ka contructore banega
    Student1(){
    super();
    }
    ye default call hota hai , jo ki parent
    class ke zero parameterised constructor call ho rha hai,
    essi liye Human1 class ka constructor call ho rha hai.
     */



    void disp(){
        System.out.println("The age is : "+age);
//        System.out.println("The name is : "+name);
        /*
        here name inherit nhi ho rha hai encapsulation me padhe the
        private specifier within class he call hoti hai, inherit class me
        bhi nhi hota hai call
         */
    }

}

public class Inheritance2 {
    public static void main(String[] args) {

        Student1 st1 = new Student1();// yaha jab new Object bana rahe hai
        // Student1 ka to ek Student1 ka default contructor call ho rha hia ,
        // jisme default me first line super() method call ho rha hia jo ,
        // parent class ke zero paramerised constructor ko call kar rha hai
        /*
        private properties and contructor inherit nhi hota  hai.
         */

        st1.sleep();
        st1.disp();

    }
}
