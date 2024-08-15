package OOPSinJAVA.StaticKeyWord;

public class launch1 {

    static int a;

    static{
        System.out.println("Static blocks");
        int [] arr = {3,4,5,6};
        for(int i = 0; i < arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
//        a=10;
//        System.out.println(a);
    }

    public static void main(String[] args) {
        System.out.println("Main Methods");
    }
}
