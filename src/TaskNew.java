/**
 * FirstProject
 * 29.06.20 11: 20
 */
public class TaskNew {
    public static void main(String[] args) {
        int[] a = {2, 5, 3, 18};
//        int k = 6;
        int k1 = 6;

//        System.out.println(findNumber(a, k)); //8 // true
        System.out.println(findNumber(a, k1)); //3 // false
    }

    private static boolean findNumber(int[] a, int n) {
        boolean result = false;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (i != j && a[i] + a[j] == n) return true;
            }
        }
        return false;
    }
}
