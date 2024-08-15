package Introduction_To_Arrays;
class multiArray{
    void twoDimenArray(){
        int[][] array = new int[2][3];
        int[][] array1 = {{45,25,36,89},{65,96,78,63},{23,6}};
        //    3-D array
//        int[][][] array_3 = new int[2][3][2];
//        array_3[][][]=1;
        System.out.println(array1[0][0]);
        System.out.println(array1[0][1]);
        System.out.println(array1[0][2]);
        System.out.println(array1[0][3]);

        System.out.println(array1[1][0]);
        System.out.println(array1[1][1]);
        System.out.println(array1[1][2]);
        System.out.println(array1[1][3]);

        System.out.println(array1[2][0]);
        System.out.println(array1[2][1]);
//      System.out.println(array1[2][2]);
// ye error dega out of bound , kyu ki main array ka last element
// me jo array hai , usme do element he hai , aur hum 3rd element call kar rahe hai
    }
}
public class Two_D_Array {
    public static void main(String[] args) {
        multiArray obj =  new multiArray();
        obj.twoDimenArray();
    }
}




