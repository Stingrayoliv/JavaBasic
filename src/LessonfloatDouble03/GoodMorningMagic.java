package LessonfloatDouble03;

/**
 * Занятие по типам данных 3 продолжение
 */
public class GoodMorningMagic {

    public static void main(String[] args) {
        // magicPower();
        int a = 2;
        int b = 3;
        magicAddition(a, b);
        myPrint(a);
    }

    public static void magicAddition(int a, int b) {
        int c = a + b;
        System.out.println("Сумма а и б - с: " + c);
    }

    public static void myPrint(int a) {
        System.out.println("Значение переменной a: " + a);
    }

    public static void magicPower() {
        double firstVariable = 2.0;
        double secondVariable = 20.0;
        double thirdVariable = 10.0;
        double result = Math.pow(firstVariable, thirdVariable);
        double secondResult = Math.pow(firstVariable, thirdVariable);
        int lifeResult = (int) secondResult;
        System.out.println("Преобразование результата в степень 2^20: " + lifeResult);
        System.out.println("результатматематической операции: " + result);
    }

}
