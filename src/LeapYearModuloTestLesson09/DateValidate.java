package LeapYearModuloTestLesson09;

/**
 * FirstProject
 * 5/5/20 20: 43
 * Напишите метод проверки передаваемой даты.
 *
 * Метод вывода даты на экран монитора принимает 3 целочисленных значения(день, месяц, год) и разделитель (например "-").
 * Проверить значения данных на адекватность, и если надо дописать нули.
 * - 5.6.2020 должно быть выведено на экран как "05-06-2020" - 50.40.2020 не должно быть выведено вообще
 */
public class DateValidate {
    public static void main(String[] args) {
        //dateCheckTest();
        //teoreticDayTest();
        //checkDayTest();
        correctWritingDateTest();

    }

    public static String correctWritingDate(int day, int month, int year, String placeholder) {
        String result = "";
        String dayTemp= ""; // это день, который будет написан в верном формате (если было 1, то будет 01)
        String monthTemp= ""; // это месяц, который будет написан в верном формате (если было 1, то будет 01)
        String yearTemp= "";

        if (dateCheck(day, month, year)) {
            if (day<10) {
                dayTemp = "0" + Integer.toString(day); // день необходимо получить в String
            } else {
                dayTemp = Integer.toString(day);
            }

            if (month<10) {
                monthTemp = "0" + Integer.toString(month); // месяц необходимо получить в String
            } else {
                monthTemp = Integer.toString(month);
            }

            if (year<10) {
                yearTemp = "0" + Integer.toString(year); // год необходимо получить в String
            } else {
                yearTemp = Integer.toString(year);
            }
            result = dayTemp + placeholder +monthTemp +placeholder + yearTemp;
        } else {
            result =Integer.toString(day) + placeholder + Integer.toString(month)+  placeholder +
                    Integer.toString(year)  + placeholder + "не является корректной датой";
        }
        return result;
    }

    public static void correctWritingDateTest() {
        System.out.println("Если мы передаём 15.2.2020 и *, то ожидаем 15*02*2020: "
                + correctWritingDate(15, 2, 2020, "*"));
        System.out.println("Если мы передаём 5.12.2020 и *, то ожидаем 05*12*2020: "
                + correctWritingDate(5, 12, 2020, "---"));
    }



    public static boolean dateCheck(int day, int month, int year) {
        boolean result = false;
        result = checkDay(day, month, year) && checkMonth(month) && checkYear(year);
        return result;
    }

    public static boolean checkDay(int day, int month, int year) {
        boolean result = false;
        if (checkYear(year) & checkMonth(month) & day > 0 & day <= teoreticDay(month, year)) {
            result = true;
        }
        return result;
    }

    public static void checkDayTest() {
        System.out.println("проверка адекватности дня. Передаю дату 10.12.20, ожидаю true : " + checkDay(10, 12, 20));
        System.out.println("проверка адекватности дня. Передаю дату 10.12.20, ожидаю true : " + checkDay(10, 12, 2020));
        System.out.println("Передаю дату 29.2.2020, ожидаю true : " + checkDay(29, 2, 2020));
        System.out.println("Передаю дату 29.2.2019, ожидаю false : " + checkDay(29, 2, 2019));
    }

    public static boolean checkMonth(int month) {
        boolean result;
        result = month >= 1 && month <= 12;
        return result;
    }

    public static boolean checkYear(int year) {
        boolean result;
        result = year > 0 && year < 2021;
        return result;
    }

    public static void dateCheckTest() {
        System.out.println("Передаю 25.7.1995: " + dateCheck(25, 7, 1995) + " ожидаю true ");
        System.out.println("Передаю 35.7.1995: " + dateCheck(35, 7, 1995) + " ожидаю false ");
        System.out.println("Передаю 25.7.-7: " + dateCheck(25, 7, -7) + " ожидаю false ");
        System.out.println("Передаю 25.15.2020: " + dateCheck(25, 15, 2020) + " ожидаю false ");
        System.out.println("Передаю 29.2.2020: " + dateCheck(29, 2, 2020) + " ожидаю true, высокосный");
        System.out.println("Передаю 29.2.2019: " + dateCheck(25, 2, 2019) + " ожидаю false, не высокосный");
    }

    public static int teoreticDay(int month, int year) { //метод, который считает теоретически количество дней в зависимости от месяца
        int tempDay = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                tempDay = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                tempDay = 30;
                break;
            case 2:
                tempDay = 28;
                break;
            default:
                tempDay = 0;
                break;
        }

        if (HelloLeapYear.checkLeapYearDos(year) && month == 2) { // вызываем метод из другого класса
            tempDay = tempDay + 1; // дней будет в феврале 29 так, как год высокостный
        }
        return tempDay;
    }

    public static void teoreticDayTest() {
        System.out.println("Передаю 02.2020, ожидаю 29 - " + teoreticDay(2, 2020));
        System.out.println("Передаю 02.2019, ожидаю 28 - " + teoreticDay(2, 2019));
        System.out.println("Передаю 07.2020, ожидаю 31 - " + teoreticDay(7, 2020));
        System.out.println("Передаю 09.2020, ожидаю 30 - " + teoreticDay(9, 2020));
        System.out.println("Передаю 15.2030, ожидаю 0 - " + teoreticDay(15, 2030));

    }
}
