package Lesson013;

/**
 * FirstProject
 * 5/11/20 12: 49
 */
public class TernarHello {
    public static void main(String[] args) {
        methodTwo(false);
        //methodTwo(true);
        methodThree(true);
        ternar(5);

    }
    public static void methodTwo(boolean b) {
        int number = 0;
        if (b ==true) {
            number = 10;
        } else {
            number = -10;
            System.out.println(number);
        }

    }
    public static void methodThree(boolean b) {
    int number = (b)? 10: -10;
        System.out.println(number);
    }
    public static void ternar(int schoolАttestat) {
        String resultAtHome = "";
        resultAtHome = (schoolАttestat >= 3) ? "Ребёнок переходит в следуюший класс" : "Ребёнок остаётся на второй год";
        System.out.println( "Результат учёбы за год: " +  resultAtHome);
    }
}
