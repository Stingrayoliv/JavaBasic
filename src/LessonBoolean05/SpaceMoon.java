package LessonBoolean05;

/**
 * Урок 5
 * FirstProject
 * 4/27/20 10: 53
 */
public class SpaceMoon {
    public static void main(String[] args) {
        //что бы послать ракету в космос нам надо:
        // температура, достаточное количсетво топливаб 4 члена экипажа
        int ekipaj = team();
        int bak = fuel();
        fly(ekipaj, 25, 100);
    }

    public static void fly (int team, int temperatur, int fuel) {
        // проверяем количество экипажаб температуры и топлива
        // обратный отчет
        System.out.println("you can fly");
    }

    public static int team() {
        // вычесления
        int team = 4;
        return team; // возвращаем значение
    }
    public static int fuel() {
        // вычесления изменились
        int toplivo = 10_000;
        return toplivo;
    }
}
