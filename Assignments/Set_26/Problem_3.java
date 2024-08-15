package Assignments.Set_26;

            // jusrt swap two elements in the arraylist

import java.util.ArrayList;

public class Problem_3 {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);

        System.out.println(l);

        System.out.println(l.size());

        int i = 2;
        int j = 4;

            Integer temp = l.get(Integer.valueOf(i));
            l.set(i, l.get(j));
            l.set(j,temp);



        System.out.println("after reversing the arraylist "+l);
    }
}
