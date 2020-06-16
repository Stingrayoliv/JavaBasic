package HomeworkAll.OBJ;

/**
 * FirstProject
 * 6/16/20 22: 22
 */
public class Swan {
    int[] IDSwan; //ИД в базе
    double weight;


    boolean checkFly(double weight) { //проверить может ли гусь летать
        return weight < 5.0; // гусь может летать
    }

    void feedingTimes(double weight) {
        if (checkFly(weight)) { //если гусь может летать, то ест 2 раза в день
            System.out.println("feed 2 times: at 6:00 a.m and at 3:00 p.m");
        } else {
            System.out.println("feed 1 times: at 10:00 a.m ");
        }
    }

    void move(int[] IDSwan) {// если в ИД цифры подряд будут элементы 5 и следующий от 8-х,
        // то гусь будет перемещен на фабрику 5
        boolean resultMove = false;

        for (int i = 0; i < IDSwan.length - 1; i++) {
            if (IDSwan[i] == 5 && IDSwan[i + 1] >= 8) {
                System.out.println("move to factory 5");
                resultMove = true;
            }
        }
        if (!resultMove) {
            System.out.println("stay at current factory");
        }
    }
}
