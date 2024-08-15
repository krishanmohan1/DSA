package OOPSinJAVA;

public class StudentClass {

//    public static void change(Student x ){
//        x.name="akash";
//    }
//    public static void fun(Student x){
//        System.out.println(x.name);
//    }


    public static void main(String[] args) {
//        Student s1 = new Student();  // x naam ka bada dabba banaya usme name,rno,percentage store karaya.  using (.) opertaor
//        s1.name="Mohan bAba";
//        System.out.println(s1.name);
//        s1.rno=56;
//        s1.percent=58.6;

//        System.out.println(s1.a);
//        change(s1);
//        System.out.println(s1.name); // yaha name change hoga , pass by refernce hota hai .


//        Student s1 = new Student();
//        s1.name="Krish";
//        s1.percent=76;
//        s1.rno=56;  yaha access nhi kar paoge kyu ki 'rno' private hai , wo within class he access hoga .

//       int x= s1.getRno(); // yaha 'rno' ko fectch karke x me store karega
//        System.out.println(x);

//        s1.setRno(49);  // yaha hum rno ko value set kar rahe hai ,
//        System.out.println(s1.getRno());

//        Student s1 = new Student("mohan",23,89.90);
//
//        System.out.println(s1.name);
//        System.out.println(s1.rno);
//        System.out.println(s1.percent);

        Student s1 = new Student("moohan",34,43.5);
        System.out.println(s1.numOfStudent);
        Student s2 = new Student("krish",89,36.45);
        System.out.println(s2.numOfStudent);
        Student s3 = new Student("kamal",96,99.2);
        System.out.println(s3.numOfStudent);





    }
}
