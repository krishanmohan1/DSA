package ArrayList;


/*
             Write a program to Reverse the given ArrayList
             Input – [0, 10,3,5,22,10]
             Output – [10,22,5,3,10,0]
 */

import java.util.ArrayList;

public class ArrayList_1 {
    public static void main(String[] args) {


        //  Wrapper Class

//        Integer i =  Integer.valueOf(12256);
//        System.out.println(i);
//
//        Float f = Float.valueOf(5.6f);
//        System.out.println(f);

        ArrayList<Integer> l1 = new ArrayList<>();

        // adding a new element
        l1.add(5);  // 5
        l1.add(6);  // 5 6
        l1.add(7);  // 5 6 7
        l1.add(8);  // 5 6 7 8


        // Get an elements at iindex i

        System.out.println(l1.get(1)); // 6   // get() method is used fetch the elements

        // print with the loop
        for(int i = 0 ; i < l1.size(); i++){
            System.out.println(l1.get(i));  // [5,6,7,8] //  length of array list --> by size() method
        }

        // Printing the array list directly
        System.out.println(l1);  // [5,6,7,8]

        // adding elements at some index i
        l1.add(1,100); // [5 100 6 7 8]
        System.out.println(l1);

        // modifying elements at index i
        l1.set(1,10);
        System.out.println(l1); // [5 10 6 7 8]

        // removing an elements at index i

        l1.remove(3);  // it will remove the value at index 3
        // if want to remoove elements directly
        l1.remove(Integer.valueOf(7));

        // Checking if an elements exists
        boolean ans = l1.contains(Integer.valueOf(10));  // it return the boolean value
        System.out.println(ans);

        // if you don't specify class , you can put anything inside l
        ArrayList l = new ArrayList();
        l.add(4);
        l.add("jsdhva");
        System.out.println(l);






    }
}
