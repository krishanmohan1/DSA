package Assignments.Set_22_IntroTo2D;

public class Problem_1 {

    public static int find(int [][] arr , int x){
        for(int i = 0 ; i < arr.length; i ++){
            for(int j = 0 ; j < arr[i].length; j ++){
                if(x == arr[i][j]){
                    System.out.println("Row: " + i);
                    System.out.println("Column: "+ j);

                }

            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int x = 12;
        int [][] arr = {{3,8,0},{6,3,2},{12,9,10}};
        find(arr,x);

    }
}
