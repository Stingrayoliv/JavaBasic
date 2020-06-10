package HomeworkAll;
/**
 * FirstProject
 * 6/10/20 20: 44
 */
//Ханойская башня. Даны три стержня, на один из которых нанизаны 3- е колец, причём кольца отличаются размером и лежат
// меньшее на большем. Нужно  перенести пирамиду из восьми колец за наименьшее число ходов на другой стержень.
    /*
Step 1 : Shift first disk from 'A' to 'C'.
Step 2 : Shift second disk from 'A' to 'B'.
Step 3 : Shift first disk from 'C' to 'B'.

The pattern here is :
Shift 'n-1' disks from 'A' to 'C'.
Shift 'n-1' disks from 'A' to 'B'.
Shift last disk from 'A' to 'C'. - только для последнего
Shift 'n-1' disks from 'C' to 'B'.
     */

public class Homework033TowerHanoiWithRecursion {
    public static void main(String[] args) {
        solveHanoi(3, 'A', 'B', 'C');
    }

    public static void solveHanoi(int n, char rodFrom, char middleRod, char rodTo) {
        // если у нас 1 кольцо на А, то просто перенести его на С
        if (n == 1) { //это условия для выхода recursion
            System.out.println("Plate 1 from " + rodFrom + " to " + rodTo);
            return; // для выхода из recursion
        }
        // если у нас не 1 кольцо, то второй шаг перенести с A на B
        solveHanoi(n - 1, rodFrom, rodTo, middleRod);
        System.out.println("Plate " + n + " from " + rodFrom + " to " + rodTo);
        // третий  шаг: перенести с C на B
        solveHanoi(n - 1, middleRod, rodFrom, rodTo);

    }
}
