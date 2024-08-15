package CollectionFrameWorkInJava.ArrayList;

import java.util.ArrayDeque;

        // index wise insertion deletion is not allowed ,

public class ArrayDeque1 {
    public static void main(String[] args) {
        ArrayDeque ad1 = new ArrayDeque();
        ad1.add(100);
        ad1.add(200);
        System.out.println(ad1);

        ad1.addFirst(1);    // first end pe add karna ho to
        ad1.addLast(2);     // last end pe add karna ho to
        System.out.println(ad1);

        ad1.add("pw");   // heterogenous data can be stored
        System.out.println(ad1);

            // offer works same as add, but it can be rejected

        ad1.offer("Mohan");
        ad1.offerFirst("Krishan");
        ad1.offerLast("BaBa");
        System.out.println(ad1);
    }
}
