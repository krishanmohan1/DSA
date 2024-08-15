package Assignments.Set_26;

import java.util.ArrayList;

public class Problem_5 {
    public static void main(String[] args) {

        int [] arr= {-4,-9,-3,-3,-2};
        printPositive(arr);

    }

    public static void printPositive(int[] arr){
        ArrayList<Integer> l = new ArrayList<>();
        for(int num : arr){
            if(num>=0){
                l.add(num);
            }
        }
        if(l.isEmpty()){
            System.out.println("NA");
        }else{
            System.out.println(l);
        }

    }
}

