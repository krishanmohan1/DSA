package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortArraylistInDecendingOrder {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        System.out.println("Original list: "+list);
        Collections.sort(list);
        System.out.println(list);
        // there is comparator which tell on what basis i have to sort
        Collections.sort(list,Collections.reverseOrder());
        // ye sare Collections class ke inbuilt methods hain jo ki
    }
}
