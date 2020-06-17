package HomeworkAll.Homework038OBJ;

/**
 * FirstProject
 * 6/16/20 22: 23
 */
public class StartForSwan {
    public static void main(String[] args) {
        Swan firstSwan = new Swan();
        firstSwan.IDSwan = new int[]{5, 9, 8, 9, 0, 5};
        firstSwan.weight = 7.0;

        Swan secondSwan = new Swan();
        secondSwan.IDSwan = new int[]{0, 9, 9, 9, 0, 6};
        secondSwan.weight = 2.0;

        System.out.println("Swan №1 should:");
        firstSwan.feedingTimes(firstSwan.weight);
        firstSwan.move(firstSwan.IDSwan);
        System.out.println("----------------------------");

        System.out.println("Swan №2 should:");
        firstSwan.feedingTimes(secondSwan.weight);
        firstSwan.move(secondSwan.IDSwan);
    }
}
