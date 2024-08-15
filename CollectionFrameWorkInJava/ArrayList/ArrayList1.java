package CollectionFrameWorkInJava.ArrayList;

import java.util.ArrayList; // ArrayList ek class hai , util package me jisko yaha import kar rahe hai.

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList();
        al1.add(100);
        al1.add(200);
        al1.add(300);
        System.out.println(al1);

        ArrayList al2 = new ArrayList();
        al2.add("krishan");
        al2.add(562);
        al2.add("baba");
        al2.add('T');
        System.out.println(al2);  // its heterogenous ArrayList
        al2.add(100);
        System.out.println(al2);

        ArrayList al3 = new ArrayList();
        al3.add(1);
        al3.add(2);
        al3.add(4);
        System.out.println(al3);

        System.out.println("After Adding collections");

        al3.addAll(al2);
        System.out.println(al3);

        // add element at specific index.
        al3.add(1,"Mohan BABA");
        System.out.println(al3);

        // add Collection At specific index

        al3.addAll(2,al2);
        System.out.println(al3);

        // when we add elements or collection at specific index , rest elements of previous  ArrayList will shifted to right.

        // yaha par index based insertion is not good practice we prefer to use linkllist.

        System.out.println("****************************************************");

         ArrayList al4 = new ArrayList();
         al4.add(1);
         al4.add(2);
         al4.add(4);

        System.out.println(al4);  // Order of insertion is preserved.
        System.out.println("****************************************************");
        al4.add(4);  // dublicates is allowed
        System.out.println(al4) ;




    }
}
