package Exercises.Array03;

/**
 * FirstProject
 * 6/23/20 00: 04
 */
public class ExArray0302 {
    public static void main(String[] args) {
        int[] a1 = {1, 1, 1, 2, 1,};//true
        int[] a2 = {2, 1, 1, 2, 1};//false
        int[] a3 = {10, 10};//true
        System.out.println(canBalance(a1));
        System.out.println(canBalance(a2));
        System.out.println(canBalance(a3));


    }
    //Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers
    // on one side is equal to the sum of the numbers on the other side.
    private static boolean canBalance(int[] array) {
        // найти сумму всех элементов массива
        //разделить сумму пополам
        // складывать накопительно  элементы массива и сравнивать с 1/2 суммы
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }

        sum = sum / 2;

        int pivot = 0;// index of the element
        int leftSum = 0;
        for (int i = 0; i < array.length; i++) {
            leftSum = leftSum + array[i];
            if (leftSum == sum) {
                pivot = i;
                break;
            }

        }
        //System.out.println(" Pivot " + pivot);
        int rithSum = 0;
        for (int i = pivot + 1; i < array.length; i++) {
            rithSum = rithSum + array[i];
        }
        if (rithSum == leftSum) return true;

        return false;
    }

}
