package LessonsForCalculator10;

/**
 * FirstProject
 * 5/5/20 11: 52
 *
 * Способы записи для for
 * int a = 0;
 * a ++;
 * a = a + 1;
 * a += 1;
 * i и потом j и k
 * i++ можно записать как i = i+1; i = iteraror;
 *
 */
public class HalloFor09 {
    public static void main(String[] args) {
        fabricForWeek();
    }

    public static void fabricForWeek() {
        int weekDays = 7;
        for (int i = 1; i < weekDays; i++) { // начало условия ШАГ
            System.out.println("День " +i);// для проставления нумерации
            System.out.println("-----------");// цикл, или loop
            System.out.println("Новый день");
            System.out.println("я встаю в 6 утра");
            System.out.println("иду на завод к восьми");
            System.out.println("заканчиваю работать");
            System.out.println("возвращаюсь");
            System.out.println("я уже дома");
            System.out.println("курю на лестнице");
            System.out.println("иду спать");
            System.out.println("день подошел к концу");
            System.out.println("-----------");
        }
    }
    public static void fabric() {
        boolean morning = true;
        boolean evening = true;
        if (morning) {
            // идем на завод
        } else if (evening) {
            // возвращается с работы
        }
    }
}