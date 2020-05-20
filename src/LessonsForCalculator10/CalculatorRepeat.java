package LessonsForCalculator10;

/**
 * FirstProject
 * 5/5/20 18: 55
 *
 * * Написать новый класс Calculator и метод newCalculate;
 * * который принимает два целых числа и оператор String ( "*", "+","-",":"),
 * * а возвращает операцию между этими числами. Недопустить деление на ноль.
 */
public class CalculatorRepeat {
    public static void main(String[] args) {

        int a = 5;
        int b = 0;
        newCalculateTest();
        newCalculateIfTest();
    }

    public static String avoidZeroTwo(int a, int b) {
        String tempResult = "";
        if (b == 0) {
            tempResult = "Ошибка, деление на 0 невозможно";
        } else {
            tempResult = String.valueOf(a / b); // значение будет представлено в стринге
        }
        return tempResult;
    }

    public static String newCalculate(int a, int b, String toDo) {
        String result = " "; // если int result = 0, то иницилизируем 0, если String =  ""  - прямой строкой
        switch (toDo) {
            case "+":
                result = String.valueOf(a + b);
                break;
            case "_":
                result = String.valueOf(a - b);
                break;
            case "*":
                result = String.valueOf(a * b);
                break;
            case ":":
                result = avoidZeroTwo(a, b); //
                break;
            default:
                result = "Mistake"; // должны тут получить String, потому что был стринг в методе
                break;
        }
        return result;
    }

    public static void newCalculateTest() {
        System.out.println("сложение, ожидаем 5: " + newCalculate(5, 0, "+"));
        System.out.println("вычитание, ожидаем 5: " + newCalculate(5, 0, "-"));
        System.out.println("умножение, ожидаем 0: " + newCalculate(5, 0, "*"));
        System.out.println("деление, ожидаем ошибку: " + newCalculate(5, 0, "/"));
    }

    public static String newCalculateIf(int a, int b, String toDo) {
        String result = " ";
        if (toDo == "+") {
            result = String.valueOf(a + b);
        } else if (toDo == "-") {
            result = String.valueOf(a - b);
        } else if (toDo == "*") {
            result = String.valueOf(a * b);
        }  else if (toDo == ":") {
            result = avoidZeroTwo(a, b);
        } else {
            result = "оператор не распознан! Help!";
        }
        return result;
    }
    private static void newCalculateIfTest() {
        System.out.println("4*5 - ожидаем 20 - " + newCalculateIf(4, 5, "*"));
        System.out.println("3/5 - ожидаем 0 " + newCalculateIf(3, 5, ":"));
        System.out.println("3/0 - ожидаем ошибку - " + newCalculateIf(3, 0, ":"));
        System.out.println("10-6 - ожидаем 4 - " + newCalculateIf(10, 6, "-"));
        System.out.println("4+5 - ожидаем 9 - " + newCalculateIf(4, 5, "+"));
        System.out.println("4 абычто 5 - ожидаем ошибку - " + newCalculateIf(4, 5, "дфгхдхйнгфйхг"));
    }
}
