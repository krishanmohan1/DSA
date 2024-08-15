package Scope_Of_Variable;

class Algebra{
//    int a = 10; // member varibale, esko kehte hai class level scope variable
//    int b = 5;

    int add(){
        int p = 10; // ye hua method level scope varibale , esko add() method ke bahar access nhi kar sakte hai .
        int q = 20;
        return p+q;

//        return a + b;

    }
//    int sub(){
////        return a-b;
//
//    }
//    int mul(){
//       return a*b;
//
//    }

    void demo(){

        int a = 10;
        System.out.println(a);
   //      System.out.println(b); // yaha par b ko print nhi kar sakte hai

        {
            int b = 100; // esko kehta hai block level scope variable
            System.out.println(b);
        }


        for(int i = 1 ; i<5;i++)
        {
            System.out.println("hello mohan");
        }

        {

        }





//        System.out.println(b);
        // yaha par bhi b ko print nhi sakte hai
    }

}

public class main {
    public static void main(String[] args) {

    }
}
