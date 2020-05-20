package StringMethods;

/**
 * FirstProject
 * 5/11/20 22: 53
 */
public class StringMethods {
    public static void main(String[] args) {
        workWithString();
    }
    // 5 методов со String
    public static void workWithString() {
        // используем  метод trim(). Удаляет начальные и конечные пробелы.
        String a = "    YIIIjhjhjjh    ";
        String resultOne = a.trim();
        System.out.println("String resultOne без начальных и конечных пробелов: " + resultOne);

        // используем метод indexOf(), который находит индекс первого вхождения подстроки в строку
        String fruits = "appleBananOrange";
        int resultTwo = fruits.lastIndexOf("O");
        System.out.println("находит индекс первого вхождения подстроки в строку fruits: " + resultTwo);

        // используем метод equals(), который равнивает строки с учетом регистра
        String b = "Hello";
        String c = "Hi";
        boolean resultThree = b.equals(c);
        System.out.println("String b equals to String c: " + resultThree);

        // replaceFirst(String regex, String replacement)
        // ) method replaces the first substring 'regex' found that matches the given argument substring
        // (or regular expression) with the given replacement substring.
        // The substring matching process start from beginning of the string (index 0).
        String tort = "Сладкий, ореховый торт";
        String tortOne = "сырный";
        String resultFour = tort.replaceFirst("свежий", tortOne);
        System.out.println("ореховый изменился на сырный: " + resultFour);

        // используем метод compareToIgnoreCase(String str)
        //Метод возвращает 0, если строка равна другой строке, игнорируя различия регистра. Значение меньше 0 возвращается,
        //если строка меньше другой строки (меньше символов)
        //и значение больше 0, если строка больше другой строки (больше символов).
        String first = "HELLO";
        String second = "hello";
        int resultFive = first.compareToIgnoreCase(second);
        System.out.println(resultFive);

        String myStrOne = "HELLO";
        String myStrSecond = "oooooo";
        System.out.println(myStrOne.compareToIgnoreCase(myStrSecond));
    }
}

