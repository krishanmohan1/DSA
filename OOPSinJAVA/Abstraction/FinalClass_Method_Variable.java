package OOPSinJAVA.Abstraction;

//final class Animal1{
//    void sleep(){
//        System.out.println("Animal is sleeping");
//    }
//}

/*
final class cannot be inherited
 */

class Animal1{

    final int age = 19;
    final void sleep(){  // final method cannot be Override
//        age=59; // can't possible final variibale cannot  be changes/modified
        System.out.println("Animal is sleeping");
    }
}
class Tiger extends Animal1{

//    void sleep(){   final method cannot be Override
//
//    }

}

public class FinalClass_Method_Variable {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.sleep();

    }
}
