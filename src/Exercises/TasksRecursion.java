package Exercises;

/**
 * FirstProject
 * 6/10/20 12: 29
 */
public class TasksRecursion {
    public static void main(String[] args) {
        String a = "hello";
        String b = "xxyy";
        String c = "aaaa";
        System.out.println(pairStar(a)); //"hel*lo"
//        System.out.println(pairStar(b)); //"x*xy*y"
//        System.out.println(pairStar(c)); //"a*a*a*a"


    }

    // basic - рекурсия-01-07
    // Given a string, compute recursively a new string where identical chars that are adjacent in the original string
    // are separated from each other by a "*".
    public static String pairStar(String input) {
        String placeholder = "*";
        if (input.length() < 2) {
            return input;
        }
        if (input.charAt(0) == input.charAt(1)) {
            return input.substring(0, 1) + placeholder + pairStar(input.substring(1));
        }

        return input.substring(0, 1) + pairStar(input.substring(1));
    }
}
