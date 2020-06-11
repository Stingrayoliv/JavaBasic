package Exercises.recursion;
/**
 * Занятие 34 и 35
 * FirstProject
 * 6/10/20 12: 29
 */
public class TasksRecursion {
    public static void main(String[] args) {
        // basic - рекурсия-01-07
        String a = "hello";
        String b = "xxyy";
        String c = "aaaa";
        System.out.println(pairStar(a)); //"hel*lo"
//        System.out.println(pairStar(b)); //"x*xy*y"
//        System.out.println(pairStar(c)); //"a*a*a*a"

        //basic - recursion -08
        String aa = "abc"; //1
        String bb = "abcxxabc"; //2
        String cc = "abaxxaba"; //2
        System.out.println(countAbc(aa));
        System.out.println(countAbc(bb));
        System.out.println(countAbc(cc));
        helloSubstring();

        //basic - recursion -09
        String k = "ahixhi"; //1
        String l = "ahibhi"; //2
        String m = "xhixhi"; //0
//        String o = "xabdxk"; //0 // дополнительные тесты
//        String p = "xxxxxxahihi"; //2 // дополнительные тесты
        System.out.println(countHi2(k));
        System.out.println(countHi2(l));
        System.out.println(countHi2(m));
//        System.out.println(countHi2(o)); // дополнительные тесты
//        System.out.println(countHi2(p)); // дополнительные тесты


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

    //basic - recursion -08
    // Count recursively the total number of "abc" and "aba" substrings that appear in the given string.
    private static int countAbc(String input) {
        String abc = "abc";
        String aba = "aba";
        String checkString;
        if (input.length() < 3) return 0;
        checkString = input.substring(0, 3);
        if (checkString.equals(aba) || checkString.equals(abc)) {
            return 1 + countAbc(input.substring(3));
        }

        return countAbc(input.substring(1));
    }

    public static void helloSubstring() {
        String test = "добро пожаловать";
        String test1 = test.substring(0, 5);
        String test2 = test.substring(5);
        System.out.println(test1);
        System.out.println(test2);
    }

    //basic - recursion -09
    // Given a string, compute recursively the number of times lowercase "hi" appears in the string, however do not
    // count "hi" that have an 'x' immedately before them.
    private static int countHi2(String input) {
        String hi = "hi";
        char x = 'x';
        String checkString;
        if (input.length() < 2) return 0;
        checkString = input.substring(0, 2);
        if (checkString.equals(hi)) {
            return 1 + countHi2(input.substring(2));
        }
        if (input.charAt(0) == x) {
            if (input.substring(1, 3).equals(hi)) {
                return countHi2(input.substring(3));
            } else {
                return countHi2(input.substring(1));
            }

        }
        return countHi2(input.substring(1));
    }


}
