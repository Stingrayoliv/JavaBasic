package HomeworkAll;

/**
 * FirstProject
 * 5/25/20 21: 16
 */
public class HomeworkPalindrome022 {
    public static void main(String[] args) {
        System.out.println(checkPalindrom("А роза упала на лапу Азора"));// -> true `
        System.out.println(checkPalindrom("поп"));// -> true`
        System.out.println(checkPalindrom("школа"));// -> false`
    }

    public static boolean checkPalindrom(String first) {
        String a = first.replace(" ", "").toLowerCase();
        String reverseA = "";

        for (int i = a.length() - 1; i >= 0; i--) {
            reverseA = reverseA + a.charAt(i);
        }
        if (a.equals(reverseA)) return true;
        return false;
    }
}
