package HomeworkAll;

/**
 * FirstProject
 * 5/11/20 19: 46
 * <p>
 * Написать задачи с помощью тернарного оператора
 */
public class HomeworkTernaryOperator013 {
    public static void main(String[] args) {

        int ageCustomer = 40;
        System.out.println("возраст покупателя: " + ageCustomer + " лет; действия кассира: "
                + AlkogolIfElseTernaryOperator(ageCustomer));
        BodyTemperature(37.5);
        System.out.println("правельное питание " + calorieСalculator(2500));
        workWithString();
    }

    // Задача №1 Про продажу алкоголя
    public static String AlkogolIfElse(int ageCustomer) {
        String result = "";
        if (ageCustomer >= 21) {
            result = "sell";
        } else {
            result = "don't sell";
        }
        return result;
    }

    public static String AlkogolIfElseTernaryOperator(int ageCustomer) {
        return (ageCustomer >= 21) ? "sell" : "don't sell";
    }

    // Задача №2 Если температура тела человека больше 37.0, то человек болеет
    public static void BodyTemperature(double temperature) {
        String result;
        result = (temperature <= 37.0) ? "здоров" : "болен";
        System.out.println("температура: " + temperature + " состояние человека: " + result);
    }

    // Задача №3 Если количество калорий в день от 1400 до 2000 ккал в день, то true
    public static boolean calorieСalculator(int calorie) {
        return (calorie >= 1400) && (calorie <= 2000) ? true : false;
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
        String resultFour = tort.replaceFirst("ореховый", tortOne);
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



