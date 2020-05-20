package LessonsForCalculator10;

/**
 * FirstProject
 * 5/5/20 09: 34
 */
public class NewCalculator {
    public static void main(String[] args) {

        int a = 100;
        int b = 0;

        //System.out.println("Результат операции");
        //System.out.println("- сложения: " + newCalculator(a, b, "+"));
        //System.out.println("- вычитание: "+ newCalculator(a, b, "-"));
        //System.out.println("- умножения: " + newCalculator(a, b, "*"));
        //System.out.println("-деление: " + newCalculator(a, b, ":"));
        //newCalculatorTest();
        newCalculatorIfTest();

    }

    public static String avoidZeroTwo(int a, int b) {
        String tempResult = "";
        if (b == 0) {
        } else {
            tempResult = String.valueOf(a / b);
        }
        return tempResult;
    }

// данный метод в задаче не использовался. Это один из вариантов получить String;
    public static String avoidZero(int digit) { // не используем этот метод так, как нам для деления нужны 2 числа
        String tempResult = Integer.toBinaryString(digit); //
        if (digit == 0) {
            tempResult = "Ошибка, деление на 0 невозможно.";
        }
        return tempResult;
    }

    public static String newCalculator(int a, int b, String toDo) {
        String result = " ";
        switch (toDo) {
            case "+":
                result = String.valueOf(a + b);
                break;
            case "-":
                result = String.valueOf(a - b);
                break;
            case "*":
                result = String.valueOf(a * b);
                break;
            case ":":
                result = avoidZeroTwo(a, b);
                break;
            default:
                result = "Mistake";
                break;
        }
        return result;
    }

    public static void newCalculatorTest() {
        System.out.println("сложение, ожидаем 5: " + newCalculator(5, 0, "+"));
        System.out.println("вычитание, ожидаем 5: " + newCalculator(5, 0, "-"));
        System.out.println("умножение, ожидаем 0: " + newCalculator(5, 0, "*"));
        System.out.println("деление, ожидаем ошибку: " + newCalculator(5, 0, "/"));
    }

    public static String newCalculatorIf(int a, int b, String toDo) {
        String result = "";
        if (toDo == "+") {
            result = String.valueOf(a + b);
        } else if (toDo == "-") {
            result = String.valueOf(a - b);
        } else if (toDo == "*") {
            result = String.valueOf(a * b);
        } else if (toDo == ":") {
            result = avoidZeroTwo(a, b);
        } else {
            result ="оператор не распознан! Help!";
        }
        return result;
    }
    public static void newCalculatorIfTest() {
        System.out.println("4*5 - сложение, ожидаем 20: " + newCalculatorIf(4, 5, "+"));
        System.out.println("вычитание, ожидаем 5: " + newCalculatorIf(5, 0, "-"));
        System.out.println("умножение, ожидаем 0: " + newCalculatorIf(5, 0, "*"));
        System.out.println("деление, ожидаем ошибку: " + newCalculatorIf(5, 0, "/"));
        System.out.println("деление, ожидаем ошибку: " + newCalculatorIf(5, 0, "jkjkjkj"));
    }
}
