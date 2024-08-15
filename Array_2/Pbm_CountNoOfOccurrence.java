package Array_2;

import java.util.Scanner;

public class Pbm_CountNoOfOccurrence {

     static int countOccurence(int [] arr, int x ) {
         int count = 0;
         for (int i = 0; i < arr.length; i++) {
             if(arr[i]==x)
             count++;
         }
         return count;
     }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();

        int arr_1 [] = new int[n];
        System.out.println("takin input : ");
        for(int i = 0; i < arr_1.length; i++){
            arr_1[i]=sc.nextInt();

        }
        System.out.println("Enter the x :");
        int x = sc.nextInt();

        System.out.println("occurance of x : " + countOccurence(arr_1,x));







        // ye ho gya baccha bala code
       /* int arr [] = {1,1,5,4,1,6,1};
        int x = 1;
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]==x){
                count++;
            }
        }
        System.out.println("Occurance of " + x + " is "+ count); */
    }
}
