package ArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class ReverseOfArrayList {


    static void reverseList(ArrayList<Integer> list){

        int i = 0;
        int j = list.size()-1;
        while(i<j)
        {
            /*
            int temp = a;
            a = b;
            b= temp;
             */

            Integer temp = list.get(Integer.valueOf(i));
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;

        }

    }
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        System.out.println("Original list: "+list);
//        reverseList(list); // calling the reversing method
        Collections.reverse(list);
        System.out.println("reversed list: "+list);





    }
}
