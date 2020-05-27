package Lesson024;

/**
 * FirstProject
 * 5/27/20 10: 42
 */
public class ArrayExercises {
    public static void main(String[] args) {
/*		1
		int[] a = new int[]{1, 2, 6};
		System.out.println(firstLast6(a));
		int[] b = new int[]{6, 1, 2, 3};
		System.out.println(firstLast6(b));
		int[] c = new int[]{13, 6, 1, 2, 3};
		System.out.println(firstLast6(c));*/

/*		3
		int[] a1 = new int[]{1, 2, 3};
		int[] a2 = new int[]{5, 11, 9};
		int[] a3 = new int[]{7, 0, 0};
		myIntArrayPrint(reverse3(a1));
		myIntArrayPrint(reverse3(a2));
		myIntArrayPrint(reverse3(a3));*/


/*		2
		int[] a1 = new int[]{1, 2, 3};
		int[] a2 = new int[]{7, 3};
		int[] b1 = new int[]{1, 2, 3};
		int[] b2 = new int[]{7, 3, 2};
		int[] c1 = new int[]{1, 2, 3};
		int[] c2 = new int[]{1, 3};
		System.out.println(commonEnd(a1, a2)); // true
		System.out.println(commonEnd(b1, b2)); // false
		System.out.println(commonEnd(c1, c2)); // true*/

		/*
		middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
		middleWay([7, 7, 7], [7, 7, 7]) → [7, 8]
		middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
		 */
        int[] a1 = new int[]{1, 2, 3};
        int[] a2 = new int[]{4, 5, 6};
        int[] b1 = new int[]{7, 7, 7};
        int[] b2 = new int[]{3, 8, 0};
        int[] c1 = new int[]{5, 2, 9};
        int[] c2 = new int[]{1, 4, 5};

/*		myIntArrayPrint(middleWay(a1, a2));  // [2, 5]
		myIntArrayPrint(middleWay(b1, b2));  // [7, 8]
		myIntArrayPrint(middleWay(c1, c2));  // [2, 4]*/
        myIntArrayPrint(middleWayOriginal(a1, a2));
        myIntArrayPrint(middleWayOriginal(b1, b2));
        myIntArrayPrint(middleWayOriginal(c1, c2));
    }

    private static int[] middleWayOriginal(int[] array1, int[] array2) {
        int[] output = new int[2];
        output[0] = array1[1];
        output[1] = array2[1];
        return output;
    }


    private static int[] middleWay(int[] a1, int[] a2) {
        int[] output = new int[2];
        output[0] = arithmeticAverage(a1);
        output[1] = arithmeticAverage(a2);
        return output;
    }

    public static int arithmeticAverage(int[] array) {
        int middle = 0;
        for (int i = 0; i < array.length; i++) {
            middle = middle + array[i];
        }
        return middle / array.length;
    }

    private static boolean commonEnd(int[] a1, int[] a2) {
/*		boolean result = false;
		if (a1[0] == a2[0] || a1[a1.length - 1] == a2[a2.length - 1]) {
			result = true;
		}
		return result;*/
        return a1[0] == a2[0] || a1[a1.length - 1] == a2[a2.length - 1];
    }

    public static boolean firstLast6(int[] args) {
        //boolean result = false;
        //if (args[0] == 6 | args[args.length - 1] == 6) result = true;
        //return result;
        System.out.println("Последний элемент: " + args[args.length - 1]);
        for (int element : args) {
            System.out.println(element);
        }

        return args[0] == 6 || args[args.length - 1] == 6;
    }

    public static int[] reverse3(int[] input) {
        int[] output = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            output[output.length - i - 1] = input[i];
        }
        return output;
    }

    public static void myIntArrayPrint(int[] input) {
        for (int elementik : input) {
            System.out.println(elementik);
        }
    }


}
