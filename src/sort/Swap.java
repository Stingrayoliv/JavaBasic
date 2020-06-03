package sort;
/**
 * FirstProject
 * 6/3/20 11: 08
 */
public class Swap {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c = a;
        a = b;
        b = c;
        System.out.println("1-ый круг");
        System.out.println("a= " + a);
        System.out.println("b= " + b);
        // а =3, б = 5;
        a = a + b;  // а = 8
        b = a - b;  // 8-5 =3
        a = a - b;  // 8-3 =5

        System.out.println("2-ый круг");

        System.out.println("a= " + a);
        System.out.println("b= " + b);

        a = a + b - (b = a);

        int i = 0;
        i++;
        ++i;
        i = ++i;

        System.out.println("3-ый круг");

        System.out.println("a= " + a);
        System.out.println("b= " + b);

        a = a ^ b;
        b = b ^ a;
        a = a ^ b;


        System.out.println("4-ый круг");

        System.out.println("a= " + a);
        System.out.println("b= " + b);
    }
}
