package RECURSION_10_FrogProblemAndMore;

public class FrogProblem {

    static int best(int [] h, int n , int idx){

        // jab idx == last index pe aajaye , tab
        if(idx == n-1) return 0;  // base case

        // fist rasta jab pahle jump , idx+1 ka he le sirf
        int opt1 = Math.abs(h[idx] - h[idx+1]) + best(h,n,idx+1);
        if(idx==n-2) return opt1; // jab idx+2 jump nhi le sakta hai
        // jab first jump idx+2 ka le tab
        int opt2 = Math.abs(h[idx] - h[idx+2]) + best(h,n,idx+2);
        return Math.min(opt1,opt2);
    }
    public static void main(String[] args) {

        int h [] = {10 , 30  , 40, 20};
        System.out.println(best(h,h.length,0));

    }
}
