package CollectionFrameWorkInJava.ArrayList;
import java.util.*;

        // HashSet And Link HashSet


public class HashSet1 {
    public static void main(String[] args) {

        HashSet hs1 = new HashSet();
        hs1.add(10);
        hs1.add(20);
        hs1.add(30);
        hs1.add(40);
        System.out.println(hs1);
        // order of insertion is not preserve
        hs1.add("MOhan");
        System.out.println(hs1);
        hs1.add(1);
        hs1.add(1);     // duplicates not allowed ,
        System.out.println(hs1);

        LinkedHashSet lhs1 = new LinkedHashSet();  // esme order of insertion preserve rehta hai
        lhs1.add(10);                               // ye , HashSet ka Subclass Hai jo linkedist aur HashSet dono ko use karta hai.
        lhs1.add(20);
        lhs1.add(30);
        lhs1.add(40);
        System.out.println(lhs1);


    }
}
