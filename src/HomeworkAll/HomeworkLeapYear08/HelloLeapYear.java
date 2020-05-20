package HomeworkAll.HomeworkLeapYear08;

/**
 * FirstProject
 * 4/30/20 12: 46
 */

/*
 * Отсюда следует распределение високосных годов:
 * год, номер которого кратен 400, — високосный;
 * остальные годы, номер которых кратен 100, — невисокосные (например, го­ды 1700, 1800, 1900, 2100);
 * остальные годы, номер которых кратен 4, — високосные.
 */
public class HelloLeapYear {
    public static void main(String[] args) {
        System.out.println(findSolutionOneLine(1358));
        System.out.println(findSolutionOneLine(1600));
    }
// решение задачи с использованием if else
    public static boolean findSolutionOneLine(int year) {
        if (year % 4 == 0 || year % 400 == 0) { // высокосный год делиться, либо на 4 либо на 400
            return true;
        } else if (year % 100 != 0) {
            return false;
        } else {
            return false;
        }

    }
}


