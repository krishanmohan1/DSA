package Java_Method.pacakage;
public class  App {
    public String Str_1 ="Within in the I Am a Public Member  "; // member variable , jo public hai ,
    void printFromClass(){   // ye ek method banaya jo kuch print kar rha hai .
        System.out.println("Within Class : "+Str_1);
    }
    public static void main(String[] args) {  // yaha phir Main method banaya ,
        App obj = new App();
        obj.printFromClass();
//        System.out.println(obj.Str_1);
        App2 obj2 = new App2();
        obj2.printFromOutsideClass();
    }
}
class App2{
    void printFromOutsideClass(){
        App obj = new App();
        System.out.println("Within Package , OutSide the class "+ obj.Str_1);
    }
}
class App3{
}

