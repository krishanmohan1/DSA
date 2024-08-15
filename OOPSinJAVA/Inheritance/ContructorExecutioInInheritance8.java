package OOPSinJAVA.Inheritance;

        // Execution Of Constrctor During Inheritance

class Pack1{
    int x , y;
    public Pack1(){
        System.out.println("Parent Class constructor");
    }
    public Pack1(int a,int b){
        System.out.println("Parameterized Constructo od parent class");
        x=a;
        y=b;

    }
}

class Pack2 extends Pack1{
    int m , n;
    public Pack2(){
        // by Default here is super() method which will call the parent class Contructor.
        super(10,25);
//        this(); yaha par agar this method dete hai to recurssive contructor invoke error aata hai
        System.out.println("Child contructor");
    }
    public Pack2(int a,int b){
        // by default here is super() method
//        super(89,87);
        this();
        System.out.println("Parameterized Constructor of child class");
        m=a;
        n=b;
    }

}

public class ContructorExecutioInInheritance8 {
    public static void main(String[] args) {
//        Pack2  p = new Pack2();

        Pack2 p2  = new Pack2(15,86);

        /*
        we can use this method and super method parameterised or non parameterised to call constructor of parent and same class contructor
        bacuse contructor and private member are not inherited in the inheritance.
         */

    }
}
