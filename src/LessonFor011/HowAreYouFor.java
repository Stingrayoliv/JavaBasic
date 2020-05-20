package LessonFor011;

/**
 * FirstProject
 * 5/6/20 10: 12
 * <p>
 * Даны целые числа А и B, где B>0. Вывести B раз число А.
 */
public class HowAreYouFor {
    public static void main(String[] args) {
        myPrettyPrintByFor();
        //reviewFor();
        //magicFor();
        //getNumber();
    }

    public static void myPrettyPrintByFor() {
        for (int i = 0; i < 10; i++) {
            //System.out.print(i);
        }
        for (int i = 1; i < 1_000_000_000; i = 10 * i) { // i увеличиваем в 10 раз
            //System.out.println(i);

        }
        String s = "s";
        for (int i = 0; i < 10; i++) {
            s = s + "a"; // преведущие значение и плюс стринг а и так 10 раз
            //System.out.println(s);
        }
        System.out.println(s);
    }

    public static void reviewFor() {
        int a = 20;
        int b = 11;
        int c;
        for (int i = 0; i < a; i++) {
            b = b + 1;
            c = i + 1;
            System.out.println("Значение Ц: " + c);
        }
        System.out.println("Значение б: " + b);
    }

    public static void magicFor() {
        for (int i = 0; i < 20; i = 2 * i) {
            System.out.println(i);
        }
    }

    // Даны целые числа А и B, где B>0. Вывести B раз число А.
    public static void getNumber() {
        int a = 2;
        int b = 10;
        for (int i = 0; i < b; i++) {
            System.out.println(a);

        }
    }


}
