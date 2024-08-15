package Assignments.Set_13;


import org.w3c.dom.ls.LSOutput;

class Triangle{
    int a,b,c;
    public double getArea() {
        double s = (a + b + c) / 2.0;
        return Math.pow((s * (s - a) * (s - b) * (s - c)), 0.5);
    }
        /*
        to use power function
        write like
        pow(x,y)--->x^y.

         */


    public double getPerimeter(){
        return a+b+c;

    }
        public class Problem_2{
        public static void main(String[] args) {
            Triangle obj = new Triangle();
            obj.a=3;
            obj.b=4;
            obj.c=5;
            System.out.println("Area of triangle is "+ obj.getArea());
            System.out.println("perimeter of Triangle is "+ obj.getPerimeter());

        }

    }


}

