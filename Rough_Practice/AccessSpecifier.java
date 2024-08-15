package Rough_Practice;
class Mohan{
    public String str="Mohan Baba";
    void printFromInsideClass(){
        System.out.println("Within Class "+ str);
    }
}



public class AccessSpecifier {
    public static void main(String[] args) {
        Mohan obj1 = new Mohan();
        obj1.printFromInsideClass();
        Mohan2 obj2=new Mohan2();
        obj2.printFromOutsideclass();

    }

}

class Mohan2{
    void printFromOutsideclass(){
        Mohan obj1 = new Mohan();
        System.out.println("Within Package , Outside Class "+ obj1.str);
    }
}
