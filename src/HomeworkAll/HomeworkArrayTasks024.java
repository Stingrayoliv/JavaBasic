package HomeworkAll;
import java.lang.reflect.Array;
/**
 * FirstProject
 * 5/27/20 15: 19
 */
public class HomeworkArrayTasks024 {
    public static void main(String[] args) {
        //05
        int[] a = new int[]{4, 5};
        int[] b = new int[]{4, 2};
        int[] c = new int[]{3, 5};
        System.out.println(no23(a)); //true
        System.out.println(no23(b)); //false
        System.out.println(no23(c)); //false
        //06
        int[] d = new int[]{1, 2, 3}; //[1, 2, 0]
        int[] k = new int[]{2, 3, 5}; //[2, 0, 5]
        int[] n = new int[]{1, 2, 1}; //[1, 2, 1]
        myIntArrayPrint(fix23(d));
        myIntArrayPrint(fix23(k));
        myIntArrayPrint(fix23(n));
    }

    public static void myIntArrayPrint(int[] input) { // для распечатки
        for (int elementik : input) {
            System.out.println(elementik);
        }
    }

    //05. Given an int array length 2, return true if it does not contain a 2 or 3.
    public static boolean no23(int[] args) {
        for (int i = 0; i < args.length; i++) {
            if (args[i] == 2 || args[i] == 3) {
                return false;
            }
        }
        return true;
    }

    // 06 Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0.
    // Return the changed array.
    public static int[] fix23(int[] input) {
        int tempValue = 0;
        for (int i = 0; i < input.length; i++) {
            if (tempValue == 2 && input[i] == 3) {
                input[i] = 0;
            }
            tempValue = input[i];
        }
        return input;
    }
}
