package LessonSwitchCase06;

/**
 * FirstProject
 * 4/29/20 09: 38
 */
public class Task0061 {
    public static void main(String[] args) {

        int nearHundredOne = 93;
        int nearHundredTwo = 90;
        int nearHundredThree = 89;
        int nearHundredFour = -10;
        int nearHundredFive = -500;
        System.out.println(nearHundredOne);
        System.out.println(nearHundredTwo);
        System.out.println(nearHundredThree);
        System.out.println(nearHundredFour);
        System.out.println(nearHundredFive);
    }

  // Учитывая int n, возвращайте true, если он находится в пределах 10 от 100 или 200.
  // Примечание: Math.abs(num) вычисляет абсолютное значение числа.
  //nearHundred(93) → true
  //nearHundred(90) → true
  //nearHundred(89) → false

    public static boolean nearHundred(int n) {
        n = Math.abs(n);
        boolean bool = true;
        int range = 10;
        int target1 = 100;
        int target2 = 200;
        bool = n >= target1 - range & n <= target1 + range || n >= target2 - range & n <= target2 + range;
        return bool;

    }
}
