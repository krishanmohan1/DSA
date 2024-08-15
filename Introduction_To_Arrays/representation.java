package Introduction_To_Arrays;

class ArrayExample {
    void demoArray() {
        int[] ages = new int[3];
        float[] weights = new float[3];
        String[] names = {"krishan", "mohan", "maa", "akanksha"};
        ages[0] = 35;
        ages[1] = 25;
        ages[2] = 65;
        /*
        flaot number jab bhi likho to last me 'f' laga do , wahi double me jaruri nhi hai
        float in = 56.1f;
        double er = 256.1256331;
         */
        //      ages[5] = 56;  // it gives error , out of bound
//        ages[-2]=25;
        weights[0] = 23.0f; // float numbers me humesa 'f' laga ke input diya karo.

        System.out.println(weights.length);
        System.out.println(names.length);
        System.out.println(ages.length);

        System.out.println(ages[0]);
        System.out.println(names[0]);
        System.out.println(names[3]);
        System.out.println(weights.length);
        System.out.println(names.length);
        System.out.println(ages.length);
    }
}
     public class representation {
     public static void main(String[] args) {
         ArrayExample obj = new ArrayExample();
         obj.demoArray();

//        System.out.println(ages[0]+" "+ ages[2]+" "+ ages[1]);


    }
}
