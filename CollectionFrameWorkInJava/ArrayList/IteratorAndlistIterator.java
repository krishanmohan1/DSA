package CollectionFrameWorkInJava.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorAndlistIterator {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(100);
        System.out.println(al);

//         for loop
//        for(int i = 0 ; i < al.size();i++){
//          Object o =   al.get(i);
//            System.out.println(o);
//        }

        // every collection me , index based accesing not allowed

        // for each
//        for(Object o : al){
//            System.out.println(o);
//        }
        // concurrent modification , like traversing ke time pe access karna , usme phir ye nhi rukega ,

        // essiliye aata hai , Iterator and ListIterator

        Iterator itr = al.iterator();   // ye Object type ka lemements store kiye hue hai.
        // ye simply ek cursor ko bana deta hai.



        while(itr.hasNext()){
//            Integer i = (Integer)itr.next();  // ye hua Object Type se interger type me Downcasting.
            System.out.println(itr.next());
        }

        // ListIterator
        ListIterator litr = al.listIterator(al.size());
        while(litr.hasPrevious()){
            System.out.println(litr.previous());
        }

        // ye peeche se iterate karega .
        // list based iterator sirf , Listed based claaes me he hai , ArrayList And LinkedList



    }
}
