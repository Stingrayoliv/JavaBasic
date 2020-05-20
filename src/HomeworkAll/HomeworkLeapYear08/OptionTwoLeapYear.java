package HomeworkAll.HomeworkLeapYear08;

/**
 * FirstProject
 * 5/1/20 16: 47
 */
/*
 * Отсюда следует распределение високосных годов:
 * год, номер которого кратен 400, — високосный;
 * остальные годы, номер которых кратен 100, — невисокосные (например, го­ды 1700, 1800, 1900, 2100);
 * остальные годы, номер которых кратен 4, — високосные.
 */
public class OptionTwoLeapYear {
    public static void main(String[] args) {
        int yearNumber = 0;
//        checkAdditionalСonditions(yearNumber);
//        checkLeapYearFourHundred(yearNumber);
//        checkLeapYearFour(yearNumber);
//        checkLeapYearOneHundred(yearNumber);
//        checkFinalLeapYear(yearNumber);
        showResult(yearNumber);

        //System.out.println(checkFinalLeapYear(yearNumber));

    }
    public static  boolean checkAdditionalСonditions(int year) { // год не должен быть отрицательным, или равным 0;
        return year > 0;
    }
    public static boolean checkLeapYearFourHundred(int year) {
        return year % 400 == 0;
    }

    public static boolean checkLeapYearOneHundred(int year) {
        return !(year % 100 == 0);
    }

    public static boolean checkLeapYearFour(int year) {
        return year % 400 == 0;
    }


    public static boolean checkFinalLeapYear(int year) {
        return checkLeapYearFourHundred(year) || checkLeapYearFour(year) && checkLeapYearOneHundred(year);
    }
    public static void showResult(int year) {
        if (!checkAdditionalСonditions(year)) {
            System.out.println(year + " такой год не существует");
        } else if (checkFinalLeapYear(year)) {
            System.out.println(year + " год высокостный");
        } else {
            System.out.println(year + " год не высокостный");
        }

    }
}
