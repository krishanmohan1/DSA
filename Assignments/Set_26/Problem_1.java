package Assignments.Set_26;

import java.util.ArrayList;

public class Problem_1 {
    public static void main(String[] args) {

        ArrayList <Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);

        System.out.println(l);

        System.out.println(l.size());

        // to insert x = 0 at first postion
        l.add(0,0);
        System.out.println(l);

    }
}
