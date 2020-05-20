package HomeworkAll.HomeworkIf007;

/**
 * FirstProject
 * 4/29/20 13: 28
 */
public class Homework07 {
    public static void main(String[] args) {
        double speed = 131;
        checkRules(speed);
        checkRules(48); // для проверки
        checkRules(51); // для проверки
        checkRules(85); // для проверки

        String trafficLightColor = "red";
        findAction(trafficLightColor);
        findAction("green"); // для проверки
        findAction("yellow"); // для проверки

        String directionKnight = "прямо";
        makeChoose("направо");
        makeChoose("налево"); // для проверки
        makeChoose("стоит на месте"); // для проверки
    }

    /*
     * Напишите программу действий для сотрудника дорожной полиции, который остановил машину.
     * При езде до 50км/час нарушений нет;
     * за езду от 50км/час до 65км/час устное порицание и лекция на 5 минут;
     * за превышение скорости от 16км/час - 40 евро штрафа;
     * за езду от 100км/час до 130км/час - штраф 500 евро;
     * и за езду свыше 130км/час - штраф в 1000 евро, забирание прав + на 3 года и конфискация транспортного средства.
     */
    public static void checkRules(double speed) {
        if (speed < 50) {
            System.out.println(speed + " км в час: " + "Нарушений нет");
        } else if (speed >= 50 && speed <= 65) {
            System.out.println(speed + " км в час: " + "Устное порицание и лекция на 5 минут");
        } else if (speed >= 66 && speed < 100) {
            System.out.println(speed + " км в час: " + "40 евро штрафа");
        } else if (speed >= 100 && speed <= 130) {
            System.out.println(speed + " км в час: " + "штраф 500 евро");
        } else {
            System.out.println(speed + " км в час: " + "штраф в 1000 евро, забирание прав + " +
                    "на 3 года и конфискация транспортного средства");
        }
    }

    /*
     * Напишите программу для машины на светофоре. Что делать если горит красный, жёлтый или зелёный свет.
     */
    public static void findAction(String color) {
        if (color == "red") {
            System.out.println(color + ": " + "Stop");
        } else if (color == "yellow") {
            System.out.println(color + ": " + "Stand and wait");
        } else {
            System.out.println(color + ": " + "can go");
        }
    }

    /*
    Напишите программу, которая объяснит наступление определённых событий в зависимости от выбора витязя.
    * На камне написано: «Как пряму ехати — живу не бывати — нет пути ни прохожему, ни проезжему, ни пролетному».
    * Следуемые далее надписи: «направу ехати — женату быти; налеву ехати — богату быти»
     */
    public static void makeChoose(String direction) {
        if (direction == "прямо") {
            System.out.println(direction + ": " + "живу не бывати — нет пути ни прохожему, ни проезжему, ни пролетному");
        } else if (direction == "направо") {
            System.out.println(direction + ": " + "женату быти");
        } else if (direction == "налево") {
            System.out.println(direction + ": " + "богату быти");
        } else {
            System.out.println(direction + ": " + "остался на месте и думает");
        }

    }
}
