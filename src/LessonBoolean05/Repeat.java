package LessonBoolean05;

/**
 * FirstProject
 * 4/27/20 10: 03
 */
public class Repeat {
    public static void main(String[] args) {
        tryWithOutCry();

    }

    public static void tryWithOutCry() {
        String name = "Петя&Васечкин";
        name = name.replace('е', 'Д'); // '' потому что Char (букву написать
        System.out.println(name);

        char symbol = name.charAt(4);
        System.out.println("Шестой индекс:" + symbol);

        String day = "Monday";
        int result = day.codePointAt(4);
        System.out.println(result);

    }
}
