package HomeworkAll;

/**
 * FirstProject
 * 5/7/20 20: 54
 */
public class HomeworkOperators012 {
    public static void main(String[] args) {
        int oneNumber = 123;
        int twoNumber = 768;
        System.out.println(showNumberBack(oneNumber) + "- перевернутое значение");
        System.out.println(showNumberBack(twoNumber) + "- перевернутое значение");

        int n = 3;
        //showRowNTimes(3);

        //showSumNumbers();
        makeCountDown();

    }

    // Задача: 1: Дано целое трехзначное число. Написать метод, который возвращает число, записанное в обратном порядке
    public static String showNumberBack(int a) {
        String reversed = ""; // перевернутая строчка
        String original = Integer.toString(a);// получили String с int
        int newTypeOne = original.length();// получаем длину строки (это будет значение в int)
        System.out.println(original + "- оригинальная строка");
        for (int i = newTypeOne - 1; i >= 0; i--) {
            reversed += original.charAt(i); //reversed =reversed + original.charAt(i);
        }
        return reversed;
    }

    // Задача 2: Дано целое трехзначное число. Написать метод, который возвращает сумму разрядов этого числа. Например:
    //123 -> 6 (1+2+3)
    public static void showSumNumbers() {
        int result = 0;
        String s = "123";
        // String[] a = s.split(" ");
//        for (int i = 1; i < a.length() ; i++) {
//            result = result + Integer.parseInt(a, i);
//            System.out.println(result);
//        }
//        result result;

    }

    // Задача 4: Реализовать метод, который выводит на экран заданную строку N раз.
    //printLineNtimes(“hello”,3)
    //hello
    //hello
    //hello
    public static void showRowNTimes(int n) {
        String s = "hello";
        for (int i = 0; i < n; i++) {
            System.out.println(s);
        }
    }

    // Задача 5: Реализовать метод(ы) “ Обратный отсчёт ” который выводит на экран цифры от 5 до 1, затем выводит строку „start“.
    //countdown() ->
    //5
    //4
    //3
    //2
    //1
    //start
    public static void makeCountDown() {
        int times = 5;
        for (int i = times; i >= 0; i--) {
            //System.out.println(makeCountDownWithStart(i));  // решении задачи 5
            System.out.println(showCountWithWords(i)); // решении задачт 6
        }

    }

    public static String makeCountDownWithStart(int number) { // для решения задачи 5, вместо 0 будет String "star"
        String result = "";
        switch (number) {
            case 0:
                result = "start";
                break;
            default:
                result = Integer.toString(number);
                break;
        }
        return result;
    }

    // Реализовать метод “ Обратный отсчёт ” который выводит на экран цифры от 5 до 1 текстом, затем выводит строку „start“.
    //countdown() -> five
    //four
    //tree
    //two
    //one
    //start
    public static String showCountWithWords(int number) {
        String result = "";
        switch (number) {
            case 5:
                result = "five";
                break;
            case 4:
                result = "four";
                break;
            case 3:
                result = "three";
                break;
            case 2:
                result = "two";
                break;
            case 1:
                result = "one";
                break;
            case 0:
                result = "start";
            default:
                result = "mistake";
                break;
        }
        return result;
    }
    // Задание.Напишите программу, где вы используете минимум 5 методов для данных типа String из библиотеки Oracle

}
