package Assignments.Set_26;

import java.util.ArrayList;

public class Problem_2 {
    public static void main(String[] args) {

        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
//        l.add(3);
//        l.add(4);
//        l.add(5);

        System.out.println(l);

        System.out.println(l.size());

        // to remove the 3rd elements from the list
        try{
            l.remove(2);
        }
        catch (Exception e){
            System.out.println(l);
        }


    }
}
