package OOPSinJAVA.Inheritance;

class Animal1{
    public void sleep(){
        System.out.println("Animal need Sleep");
    }
    public int age(int x){
        System.out.println("parametrized method");
        return x;
    }
}
class Lion extends Animal1{
    public void sleep(){ // yaha agar void sleep likh diye to error aayega , visibility ghata nhi sakte hai , badha sakte hai
        System.out.println("Lion hunts and eat");
    }
    public int age(int x){
        System.out.println("Parametrised Overriding");
        return x+5;
    }


}

// Override karne pe , method ke visibility ghatna nhi chahiye , return type same rahe and method me parameter , bhi same rehna chahiye


public class RulesOfInheritance7 {
    public static void main(String[] args) {

    }
}
