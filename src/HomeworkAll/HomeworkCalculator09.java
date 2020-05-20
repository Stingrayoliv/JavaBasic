package HomeworkAll;

/**
 * FirstProject
 * 5/4/20 20: 10
 * Написать новый класс Calculator и метод newCalculate;
 * который принимает два целых числа и оператор String ( "*", "+","-",":"),
 * а возвращает операцию между этими числами. Недопустить деление на ноль.
 */
public class HomeworkCalculator09 {
    public static void main(String[] args) {
        implementCalculator(20, 5, "+");
        implementCalculator(20, 0, "/");
    }

    public static void implementCalculator(int a, int b, String operator) {
        if (operator == "*") {
            System.out.println("ответ калькулятора при умножении: " + (a * b));
        } else if (operator == "+") {
            System.out.println("ответ калькулятора при сложении: " + (a + b));
        } else if (operator == "-") {
            System.out.println("ответ при отнимании: " + (a - b));
        } else if (operator == "/") {
            if (b == 0) {
                System.out.println("данная операция невозможна");
            } else {
                System.out.println("ответ при делении: " + a / b);
            }
        }
    }
}
