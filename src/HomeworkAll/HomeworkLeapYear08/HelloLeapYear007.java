package HomeworkAll.HomeworkLeapYear08;

/**
 * FirstProject
 * 5/1/20 17: 06
 */
public class HelloLeapYear007 {
    public static void main(String[] args) {
        int yearNumber = 2100;
        findSolution(yearNumber);
        //findOneLineSolution(yearNumber);
    }

    // решение задачи с использованием if else
    public static void findSolution(int year) {
        if (year <= 0) { // номер года не может быть меньше 0, или 0
            System.out.println(year + " такой год не существует");
        } else if (year % 4 == 0 || year % 400 == 0) {
            System.out.println(year + " год высокосный");
        } else if (year % 100 != 0) {
            System.out.println(year + " год не высокосный");
        } else {
            System.out.println(year + "не существует");
        }
    } // короткое решение
    public static void findOneLineSolution(int year) { // решение в одну строку
        if (year <= 0 && (year % 4 == 0 || year % 400 == 0)&&(year % 100 != 0)) {
            System.out.println(year + " год высокосный");
        } else {
        }
        System.out.println(year + " год не высокосный");
    }
}
