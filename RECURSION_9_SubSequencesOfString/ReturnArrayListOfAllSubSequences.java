package RECURSION_9_SubSequencesOfString;

import java.util.ArrayList;

public class ReturnArrayListOfAllSubSequences {

    static ArrayList<String> getSSQ(String s){      // s = "abc"
        ArrayList<String > ans = new ArrayList<>();
        // base case
        if(s.length()==0) {
             ans.add("");
             return ans;
        }

        char curr = s.charAt(0);
        // Sub Problem --> SmallAnswer that recursion will find out
        ArrayList<String > smallAns = new ArrayList<>();
        smallAns = getSSQ(s.substring(1));

        // smallAns = ["bc", "b" , "c" , ""]
        // ans should be
        // self work
        for(String ss : smallAns){
            ans.add(ss);
            ans.add(curr + ss);
        }
        return ans ;
    }
    public static void main(String[] args) {
        ArrayList<String> ans = getSSQ("abc");
        System.out.println(ans);

    }
}
