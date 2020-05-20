package LessonIfElseCurrencyConventor07;

/**
 * FirstProject
 * 4/29/20 12: 21
 */
public class INeedVodka {
    public static void main(String[] args) {
        int age = 10;
        checkAge(16);
        checkAge(17);
        checkAge(18);
        checkAge(25);
    }

    public static void checkAge(int age) {
        if (age< 16) {
            System.out.println("Покупателю: " +age + " Товары для взрослых категорически запрещено");
        } else if ( age >= 18) {
            System.out.println("Покупателю: " +age + " Можно продавать абсолютно все товары для взрослых");
        } else {
            System.out.println("Покупателю: " +age + " Табак продавать можно, пиво продавать можно, крепкие напитки нельзя");
        }

    }
}
