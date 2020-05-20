package LessonFor011;

/**
 * FirstProject
 * 5/6/20 09: 37
 * В определённом или в заданном интервале мы изменяем переменную по определённой формуле.
 *
 * for (начало; условие; шаг) {
 *   // ... тело цикла ... в котором можно выполнять одну, две, три или даже очень много операций.
 * }
 * for (initialization condition; testing condition; increment/decrement){
 *     statement(s)
 * }
 *
 */
public class GoodMorningFor {
    public static void main(String[] args) {
        //introductionLoopFor();
        TickTackStart();
    }

// область видимости по английски Scope
    public static void introductionLoopFor() { // void значит исполняющий метод, не возвращает переменных
        int a = 0;

        for (int i = 0; i < 10; i++) {
            a++;
            int b = 10;
            //System.out.println("перемеанная а в первом цикле: " + a);
            //System.out.println("перемеанная i в первом цикле: " + i);
            //System.out.println("просто b" + b);
        }
        for (int i = 0; i < 20; i++) {
            a++;
            int b = 20;
        }
        //System.out.println("в конце метода распечатыаем а: " + a);

   for (int i=100; i> 0; i--) { // постепенное сьедание мандаринок
       System.out.println("количество оставшихся мандаринок " + i);

   }
    }
    public static void TickTackStart() { // запуск ракеты, обратный отчет
            for (int i = 10; i > 0; i--)
                System.out.println(i);
        }
    }


