package LeapYearModuloTestLesson09;

/**
 * FirstProject
 * 5/4/20 09: 40
 */
public class HelloLeapYear {
    public static void main(String[] args) {
        //System.out.println(checkLeapYear(2000));
        //System.out.println(checkLeapYear(1900));
        //System.out.println(checkLeapYear(2020));
        //chekLeapYearUnoTest();
        chekLeapYearDosTest();
    }

    public static boolean checkLeapYearDos(int year) {
        int y400 = 400;
        int y100 = 100;
        int y4 = 4;
        boolean leapYearCheck;
        // больше нуля и делится на 400, ИСКЛЮЧАЯ деление на 100 и 4
        leapYearCheck = year > 0 && (year % y400 == 0) ^ !(year % y100 == 0) && (year % y4 == 0);
        return leapYearCheck;
    }

    public static void chekLeapYearDosTest() {
        int year2000 = 2000;
        int year1900 = 1900;
        int year4 = 4;

        if (checkLeapYearDos(year2000)) {
            System.out.println("Первый тест c тестовым годом " + year2000 + " прошел успешно");
        } else {
            System.out.println("Внимание" + "Первый тест с тестовым годом" + year2000 + " провален !");
        }
        if (!checkLeapYearDos(year1900)) {
            System.out.println("Мы ожидаем false и только тогда тест успешный" + "Первый тест c тестовым годом "
                    + year1900 + " прошел успешно");
        } else {
            System.out.println("Внимание" + "Первый тест с тестовым годом" + year1900 + " провален !");
        }
        if (!checkLeapYearDos(year4)) {
            System.out.println("Первый тест c тестовым годом " + year4 + " прошел успешно");
        } else {
            System.out.println((char) 27 + "[31m" + "Внимание" + "Первый тест с тестовым годом" + year4 + " провален !");
            // сначала поставим !в названии метода, чтобы сделать ошибку и добавим char) 27 + "[31m", чтобы добавить
            //красный цвет строки
        }
        System.out.println();
    }


    public static boolean checkLeapYear(int year) {
        boolean resultCheck = false;
        if (year % 400 == 0) {
            resultCheck = true;
        } else if (year % 100 == 0) {
            resultCheck = false;
        } else if (year % 4 == 0) {
            resultCheck = true;
        }
        return resultCheck;
    }

    public static void chekLeapYearUnoTest() {
        int year2000 = 2000;
        int year1900 = 1900;
        int year4 = 4;

        if (checkLeapYear(year2000)) {
            System.out.println("Первый тест c тестовым годом " + year2000 + " прошел успешно");
        } else {
            System.out.println("Внимание" + "Первый тест с тестовым годом" + year2000 + " провален !");
        }
        if (checkLeapYear(year1900)) {
            System.out.println("Мы ожидаем false и только тогда тест успешный" + "Первый тест c тестовым годом "
                    + year1900 + " прошел успешно");
        } else {
            System.out.println("Внимание" + "Первый тест с тестовым годом" + year1900 + " провален !");
        }
        if (checkLeapYear(year4)) {
            System.out.println("Первый тест c тестовым годом " + year4 + " прошел успешно");
        } else {
            System.out.println("Внимание" + "Первый тест с тестовым годом" + year4 + " провален !");
        }
        System.out.println();
    }

}
