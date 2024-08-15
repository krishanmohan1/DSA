package Loop.PatternByKunal;

public class Problem {
    public static void main(String[] args) {
//        pattern_1(4);
//        pattern_2(5);
        pattern_3(7);

    }
    static void pattern_1(int n ){
        for (int row = 1 ; row <= n ; row++){
            for (int col = 1; col <= n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern_2(int n){
        for (int row = 1 ; row <= n ; row ++){
            for (int col = 1 ; col <= row ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern_3(int n){
        for (int row = 0 ; row < n ; row++){
            for(int col = 0 ; col <=n-row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


}
