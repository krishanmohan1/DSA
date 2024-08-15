package Introduction_To_Arrays;
class LoopArray{
    void func (){
        int[] arr = new int[6];
        arr[0]=25;
        arr[1]=69;
        arr[2]=96;
        arr[3]=45;
        arr[4]=12;
        arr[5]=10;



        int[] arr_1 ={56,96,45,69,45,9,52,36,78,79};



        for(int i =0;i<10;i++){  // printing elements of array usng loop
            System.out.println(arr_1[i]);
        }



        // for each loop aise lagate hain
        for(int var : arr){  // esme (ar) koi naam hai , esme all element ko print karega .
            System.out.println(var);
        }

        // while loop
        int i = 0;
        while(i<arr.length){
            System.out.println(arr[i]);
            i++;


        }



        // printing 2-D array
        //int [][] ages = new int[2][3]  assining the two array .
        int two_array [][]={{2,4,5,2,},{8,2,5,3},{7,0,2}};
        for(int x =0; x<two_array.length;x++){
            for(int j = 0;j<two_array[x].length;j++){
                System.out.println(two_array[x][j]);

            }
        }
    }
}



public class Printing_Array_by_Loop {
    public static void main(String[] args) {
        LoopArray obj = new LoopArray();
        obj.func();
    }
}
