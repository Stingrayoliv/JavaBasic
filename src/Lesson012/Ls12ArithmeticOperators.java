package Lesson012;

/**
 * FirstProject
 * 5/7/20 11: 01
 */
public class Ls12ArithmeticOperators {
    public static void main(String[] args) {

    }

    public static void aoOne() {
        int a = 5;// оператор присваивания
        int b = 6;
        int c;
        c = a + b;
        c = a - b;
        c = a * a;
        c = a / b;
        c = a % b;
        a++; // соответствует - строка ниже
        a = a + 1;
        a--;  // соответствует - строка ниже
        a = a - 1;
        a += b;  // соответствует - строка ниже
        a = a + b;
        a -= b;// соответствует - строка ниже
        a = a - b;
        a *= b; // a= a * b
        a /= b; //a=a/b
        a %= b; // a = a % b

    }

    public static void aoTwo() {
        int a = 5;
        int b = 6;
        boolean c;
        boolean d = false;
        boolean f = false;
        c = a == b;
        c = a != b;
        c = a > b;
        c = a < b;
        c = a <= b;
        c = d && f;
        c = d & f;
        c = d || f;
        c = d | f;
        c = !d; // если d false, то d = false
        c = d ^ f; //XOR - исключительное ИЛИ, побитовое логические ИЛИ
        //с = d~ f; // факультативное изучение
        // &=  и с присваиванием;
        // |=  или с присваиванием;
        // ^=  басолютное или с присваиваниемж
        // < сдвиг влево
        // > сдвиг вправо
        //?: тернарный оператор (if else)
    }
}
