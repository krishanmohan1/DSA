package OOPSinJAVA.Contructor;

 class Student1{
    private int age;
    private String name;

    public Student1(){

//        super();
        this("Rohit",19);
        System.out.println("Default contructor is called ");
        name="rahul";
        age=19;
    }
    public Student1(String name){
        this();
        this.name=name;
        age=25;
    }
    public Student1(String name, int age){
        this.age=age;
        this.name=name;

    }

    public void disp(){
        System.out.println(name);
        System.out.println(age);

    }

}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.disp();

        Student1 s2 = new Student1("Mohan");
        s2.disp();

        Student1 s3 = new Student1("krish",25);
        s3.disp();


    }
}
