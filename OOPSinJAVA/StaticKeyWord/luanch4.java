package OOPSinJAVA.StaticKeyWord;

/*
        Differnce between Static method and non static method
 */


class Demo{

    static void disp1(){
        System.out.println("static method disp1");
    }
    void disp2(){
        System.out.println("non static method disp2");
    }
}
public class luanch4 {
    public static void main(String[] args) {


        Demo.disp1(); // static method Class ke naam se regernece lekar call ho sakte hai
        // static method ko call karne ke objection is not mandatory

        Demo d  = new Demo();
        // non static method ko call karne ke liye object create karna padega
        d.disp2();

        d.disp1();  //  static method ko object ke reference se bhi call kar sakte hai


    }
}
