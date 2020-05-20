package LessonfloatDouble03;

/**
 * Занятие по типам данных 3
 */
public class HalloDouble {
    public static void main(String[] args) {
        //addFloat();
        //intDivision();
        //doubleDivision();
        //goodMorningPi();
        magicNumber();
    }

    public static void magicNumber() {
        int var1 = 5;
        int var2 = 2;
        int var3 = var1 / var2;

        double var4 = 5.0;
        double var5 = 2.0;
        double var6 = var4 / var5;
        double var7 = var1 / var2;

        double var25 = var1 / var4;
        System.out.println("Int Var3 -" + var3);
        System.out.println("double Var6 - " + var6);
        System.out.println("double Var7 = " + var7);
        System.out.println("double Var25 - " + var25);

        int var11 = (int) (var1 / var4);

        System.out.println("Int Var11 -" + var11);
        System.out.println("Магия " + 5.0 / var2);
    }

    public static void goodMorningPi() {
        final double PI = 3.14;
        // final - используется для "финализации переменной"
        // теперь переменной PI нельзя присвоить новое значение
        double radius = 1_000_000.0;
        double square = PI * radius * radius;
        System.out.println("площадь нашего придуманного круга равна: " + square);
        // 1_000_000 1E+06 = 1* 10^6
        // 1E - 06 = 1/10^6
    }

    public static void doubleDivision() {
        double a, b, c;
        a = 1;
        b = 10;
        c = a / b;
        System.out.println("Результат деления а на б дает результат с: " + c);
    }

    public static void intDivision() {
        int a, b, c;
        a = 1;
        b = 10;
        c = a / b;
        System.out.println("Результат деления а на б дает результат с: " + c);
    }

    public static void addFloat() {
        float a = 3.5f;
        float b = 4.5F;
        float c = (float) 5.5;
        float d = a + b + c;
        System.out.println("a + b + c: " + d);
    }
}
