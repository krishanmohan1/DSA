package IntroToOOPs;
 public class Student { // class Student
    int rollNo;
    String studentName;
    String favSubject;




    public static void main(String[] args) {  // yaha main method me attribute ko call kiye hai
        Student obj1 = new Student();           // yaha object banaye hai ,
        System.out.println(obj1.rollNo);        // (.) dot operator ko use karke object ke attribute ko call kar rahe hai
        System.out.println(obj1.studentName);
        System.out.println(obj1.favSubject);



    }

}
