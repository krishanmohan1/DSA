package CollectionFrameWorkInJava.ArrayList;
import java.util.*;


        // priorityQueue


public class PriorityQueue1 {
    public static void main(String[] args) {

        PriorityQueue pq1 = new PriorityQueue();  // it stores the data as mini heap , that is complete binary tree concept
                                                    // in the backend.

        pq1.add(100);
        pq1.add(50);
        pq1.add(25);
        pq1.add(150);
        pq1.add(200);
        System.out.println(pq1);
//        pq1.add("mohan");  // here
//        pq1.add();  // null value ko store nhi karta hai ,
        System.out.println(pq1);

    }
}
