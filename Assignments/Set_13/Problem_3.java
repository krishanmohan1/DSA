package Assignments.Set_13;
import  java.util.*;

class Area{
    int length;
    int breadth;
    public  Area(int l, int b){ // ye constructor ka kaam karega
        length = l;
        breadth = b;
    }
    public int getArea(){ // ye method hai
        return length * breadth;

    }
}

public class Problem_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l,b;
        System.out.println("Enter the length: ");
        l = sc.nextInt();
        System.out.println("Enter the breadth: ");
        b = sc.nextInt();
        Area obj = new Area(l,b);
        System.out.println("Area : "+obj.getArea());

    }
}


