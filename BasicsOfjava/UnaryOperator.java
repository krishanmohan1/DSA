package BasicsOfjava;

public class UnaryOperator {
    public static void main(String[] args) {
        int p = 5, q = 5;

        System.out.println(p++); // 5
        /* (p++) ka mtlb hota hai pahle print karega phir increment karke store karega apne container me  */
        System.out.println(p); // 6

        System.out.println(++q); // 6
        /* (++q) esme kya hoga ki pahle container me stored valure of 1 se increment karega phir jake usko print karega */


        System.out.println(q); // 6

        int x = p++;
        int y = ++q;

        System.out.println(x); // 6
        System.out.println(y); // 7

        System.out.println(p); // 7
        System.out.println(q); // 7
    }
}
