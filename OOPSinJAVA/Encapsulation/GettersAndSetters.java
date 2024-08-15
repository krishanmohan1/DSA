package OOPSinJAVA.Encapsulation;


 class  Student{
     private int age;
     private String name;

     public Student(int age , String name){  // Constructor
         this.age = age;
         this.name=name;
     }

//     public String getName(){
//         return name;
//     }
//
//     public void setAge(int age){  // setters for private instance vairale to set value from outside
//         this.age=age;
//     }
//
//     public void setName(String name){   //Setter-2
//         this.name=name;
//     }
 }
public class GettersAndSetters {
    public static void main(String[] args) {

        Student obj1 = new Student(14,"mohan");
        Student obj2 = new Student(56,"krish");
//        System.out.println(obj1.getName());
//        obj1.setName("lord");
//        System.out.println(obj1.getName());








    }

}
