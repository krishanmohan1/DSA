package OOPSinJAVA.Contructor;
class Student{
    private int age;
    private String name;


    Student(int age,String name){
        this.age = age;
        this.name = name;
    }

//    public void setAge(int age){ //setter
//        this.age=age;
//    }
//    public void setName(String name){ //setter
//        this.name=name;
//    }
    public  String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

}

public class Launch1 {
    public static void main(String[] args) {

        Student s1 = new Student(53,"Mohan");
//        s1.setName("Krishan");
//        s1.setAge(23);
        System.out.println(s1.getName());
        String name = s1.getName();
        System.out.println(name);

    }
}