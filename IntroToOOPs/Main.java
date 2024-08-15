package IntroToOOPs;
    class student { // class Student
    int rollNo;
    String studentName;
    String favSubject;

}



    public class Main{
        public static void main(String[] args) {  // yaha main method me attribute ko call kiye hai
        student obj1 = new student();   // yaha object banaye hai ,
        obj1.rollNo=1;
        obj1.studentName="mohan";
        obj1.favSubject="java with dsa";


        System.out.println(obj1.rollNo);        // (.) dot operator ko use karke object ke attribute ko call kar rahe hai
        System.out.println(obj1.studentName);
        System.out.println(obj1.favSubject);

        student obj2 = new student();
        obj2.rollNo=1;
        obj2.studentName= "umakant";
        obj2.favSubject="physics";
        System.out.println(obj2.rollNo);
        System.out.println(obj2.studentName);
        System.out.println(obj2.favSubject);

    }



    }



