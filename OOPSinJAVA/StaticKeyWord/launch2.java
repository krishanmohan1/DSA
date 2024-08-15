package OOPSinJAVA.StaticKeyWord;

class demo1{
    static int a ;
    static int b ;

    int m ;
    int n ;



    static{

        System.out.println("static control , assigning the static variable value: ");
        a = 25;
        b = 30;

    }
    {
        System.out.println("non static block control: ");
        m = 78;
        n = 23;

    }
    static void disp1(){
        System.out.println("value of  static var m: "+a);
        System.out.println("value of  static var m: "+b);
    }
    void disp2(){
        System.out.println("Value of non static var m: "+m);
        System.out.println("Value of non static var m: "+n);
    }
}

public class launch2 {
    public static void main(String[] args) {
        demo1  d = new demo1();
        demo1.disp1();

        d.disp2();

    }
}
