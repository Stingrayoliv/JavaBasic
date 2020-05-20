package HomeworkAll.HomeworkLeapYear08;

/**
 * FirstProject
 * 5/1/20 23: 12
 */
/* Метод вывода даты на экран монитора принимает 3 целочисленных значения(день, месяц, год) и разделитель
 *(например "-"). Проверить значения данных на адекватность, и если надо дописать нули.
 * - 5.6.2020 должно быть выведено на экран как "05-06-2020" - 50.40.2020 не должно быть выведено вообще
 */
public class Homework0801 {
    public static void main(String[] args) {
        int dayNumber = 1;
        int monthNumber = 2;
        int yearNumber = 2025;
        checkDay(dayNumber);
        checkMonth(monthNumber);
        checkYear(yearNumber);
        showDate(dayNumber, monthNumber, yearNumber);

    }

    public static boolean checkDay(int day) {
        return day >= 1 && day <= 31;
    }

    public static boolean checkMonth(int month) {
        return month >= 1 && month <= 12;
    }

    public static boolean checkYear(int year) {
        return year >= 2020 && year <= 2090;
    }

    static String addZero(int date) {
        String result = Integer.toString(date);
        if (date > 0 && date < 10) {// количсетво символов для String 
            result = String.format("%02d", date);
        }
        return result;
    }

    public static void showDate(int day, int month, int year) {
        if (checkDay(day) && checkMonth(month) && checkYear(year)) {
            System.out.println(addZero(day) + "-" + addZero(month) + "-" + year);
        } else {
            System.out.println("такой даты не существует");
        }
    }
}
