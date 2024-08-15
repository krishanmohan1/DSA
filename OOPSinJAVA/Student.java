package OOPSinJAVA;


    // ye hua user define data type
  public class Student {
    public String name;
    public int rno;
    public double percent;
    final String schoolName="Vikas vidyalaya";
    static int numOfStudent =100;  // ye static keyword hai ye ek boc banayega jo fixed rahe aur ye sabhi object esko access kar payege .
    char a;

    public static  int getNumOfStudent(){ // getter for private static num of student.
        return numOfStudent;
    }
    public Student(){  // default contructor

    }

    public Student(String name, int rno, double percent){  // contructor
        this.name=name;
        this.rno=rno;
        this.percent = percent;
        numOfStudent++;


    }

      public int getRno(){  // getter function
          return rno;
      }

      public void setRno(int n){
          rno=n;
      }

        public static class Constuctor {
            public static void main(String[] args) {

                System.out.println(numOfStudent); //100


                Student s1 = new Student();  // es contructor me koi paramter pass nhi hua hai .eske liye default contructor hai
        //        s1.name="krishan";
        //        s1.rno=89;
        //        s1.percent=58.6;

        //        System.out.println(s1.name);
        //        System.out.println(s1.rno);
        //        System.out.println(s1.percent);
                System.out.println(s1.schoolName);



        //        Student s2 = new Student("mohan",85,56.8);   // eske liye parameterised contructor
        //        System.out.println(s1.name);
        //        System.out.println(s1.rno);
        //        System.out.println(s1.percent);

            }
        }
    }
