package OOPSinJAVA;

public class Fraction {



    public static class  fraction{
        int num ;
        int den;
        public fraction(int num , int den){  // it is contruction of class 'function' .
            this.num = num;
            this.den=den;

        }




    }
    public static void main(String[] args) {
        fraction f1 = new fraction(7,21);
        System.out.println(f1.num+"/"+f1.den);

//        f1.simplify();
        System.out.println(f1.num+"/"+f1.den);

//        fraction f2 = new fraction(3,7);
//        System.out.println(f2.num+"/"+f2.den);




    }
}
