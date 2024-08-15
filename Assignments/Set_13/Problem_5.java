package Assignments.Set_13;


class employee {
    int salary;

    String str;
    int yoj;
    String add;


    }


public class Problem_5 {
    public static void main(String[] args) {


        employee obj1 = new employee();
        obj1.str="Robert";
        obj1.yoj=1994;
        obj1.add="64C-WallStreet";
        employee obj2=new employee();
        obj2.str="sam";
        obj2.yoj=2000;
        obj2.add="68D-WallStreet";
        employee obj3 = new employee();
        obj3.str = "john";
        obj3.yoj = 1999;
        obj3.add = "26-B WallStreet";

        System.out.println("Name"+ "\t" + "year of joining" + "\t" + "Address ");
        System.out.println(obj1.str+"\t"+obj1.yoj+ "\t"+obj1.add);
        System.out.println(obj2.str+"\t"+obj2.yoj+ "\t"+obj2.add);
        System.out.println(obj3.str+"\t"+obj3.yoj+ "\t"+obj3.add);





    }
}
