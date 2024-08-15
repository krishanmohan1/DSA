package Rough_Practice.Exception_Hande;

public class Demo_Exception {
    public static void main(String[] args) {

        int arr[] = new int[4];
        int  i , j=1 , k=0;
        i = 8;
        j = 2;
        try {



            k = i/j;  // critical statement
//            for(int c=0;c<=4;c++){
//                arr[c]=c+1;
//            }
//            for(int var:arr){
//                System.out.println(var);
//            }
//            System.out.println(k);
        }
        catch (ArithmeticException e){  // Unchecked Exception
            System.out.println("cannot divide by zero "+e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }


        catch (Exception e){
            System.out.println("its has an Exception of "+e);
        }


//        System.out.println(k);
        System.out.println("hello mohan");

    }
}
