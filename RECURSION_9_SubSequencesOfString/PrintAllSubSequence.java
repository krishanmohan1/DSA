package RECURSION_9_SubSequencesOfString;

public class PrintAllSubSequence {

    static void printSSQ(String s , String currAns){
        // base case
        if(s.length() == 0){
            System.out.println(currAns);
            return;
        }
        char curr = s.charAt(0);
        String remAns = s.substring(1);

        printSSQ(remAns,currAns+curr); // when the current elements participate
        printSSQ(remAns,currAns); // when curr elements do not participate
    }
    public static void main(String[] args) {
        printSSQ("abc","");

    }
}
