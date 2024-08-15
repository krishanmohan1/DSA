package CollectionFrameWorkInJava.ArrayList;
import java.util.*;

public class TreeSet1 {
    public static void main(String[] args) {

        TreeSet ts1 = new TreeSet();
        ts1.add(100);
        ts1.add(50);
        ts1.add(150);
        ts1.add(25);
        ts1.add(75);
        ts1.add(125);
        ts1.add(175);
        System.out.println(ts1);  // it will print sorted array , it store the data , as balanced binary search tree ke room me .
//        ts1.add(50);    // duplicates are not allowed here .
        System.out.println(ts1);
//        ts1.add("mohan");  // Heterogenous  data not allowed it will give , runtime error.
        System.out.println(ts1);

        System.out.println(ts1.higher(50));
        System.out.println(ts1.lower(50));
        System.out.println(ts1.higher(40));

        System.out.println(ts1.ceiling(40));
        System.out.println(ts1.floor(40));

        System.out.println(ts1.ceiling(50));
        System.out.println(ts1.floor(50));

    }
}
