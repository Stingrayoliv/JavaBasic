package HomeworkAll;

/**
 * Домашняя работа boolean, codePointBefore для String и Printf
 * FirstProject
 * 4/27/20 16: 33
 */
public class Homework6 {
    public static void main(String[] args) {
        boolean a = (7 + 8) * 5 > 7 + 8 * 5; // true
        boolean b = (7 + 8) * 4 != 7 + 4 * 5; // true
        boolean c = 3 + 4 > 9 + 1 & 16 - 5 > 3 * 4; // false
        boolean d = false & true | false ^ true; //  true
        boolean e = 16 / 2 < 6 + 2 | 4 + 5 <= 4 * 5; // true
        boolean f = !(3 * 4 < 7 + 8); // false
        System.out.println(a + "\n" + b + "\n" + c + "\n" + d + "\n" + e + "\n" + f);
        getPoitBeforeNumber();
        getRoundPrice();
    }

    // метод для String codePointBefore
    // Returns the character (Unicode code point) before the specified index.
    public static void getPoitBeforeNumber() {
        String day = "Monday";
        int result = day.codePointBefore(5);
        System.out.println(result);
    }

    // метод printf. необходимо округлить цену товара
    public static void getRoundPrice() {
        double price = 1.2637484;
        System.out.printf("Цена товара: %.2f", price);
    }
}
