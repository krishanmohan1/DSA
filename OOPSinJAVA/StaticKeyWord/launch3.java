package OOPSinJAVA.StaticKeyWord;

/*
            Static Varibale and Non-Static variable me difference
 */

class Alpha{
    static int a ;
    static int b ;
    /*
    jab byte code se jvm me program load hota hai ,
    class load hota hai tabhi
    ek baar non static varible ka
    memory heap me banega only once
    and esko use har jagah hoga jaha require hoga .
     */

    int m;
    int n;

    {
        System.out.println("hello world");
    }

    static
    {
        System.out.println("static block executes");
        a = 34;
        b = 234;

    }

    {
        System.out.println("Non static Blocks Executes");
        m  = 65;
        n = 54;

    }

}

public class launch3 {
    public static void main(String[] args) {

        Alpha a = new Alpha();
        Alpha b = new Alpha();

        /*
        Jitan objects banayenge utna baar non static varibale , aur non static block executes hoga
         */



    }
}
