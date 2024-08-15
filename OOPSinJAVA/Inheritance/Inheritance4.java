package OOPSinJAVA.Inheritance;


            // Multi-Level Inheritance
class Demo1{    // extends Object class by default
    void disp() {
        System.out.println("Display method in Demo1 class");
    }
}
class Demo2 extends Demo1{

}
class Demo3 extends Demo2{

}

public class Inheritance4 {
    public static void main(String[] args) {

        Demo3 d = new Demo3();
        d.disp();
        



    }
}
