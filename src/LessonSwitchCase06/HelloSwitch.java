package LessonSwitchCase06;

/**
 * FirstProject
 * 4/27/20 12: 49
 */
public class HelloSwitch {
    public static void main(String[] args) {
        int rating = 1;
        System.out.println(crimeAndPunishment(rating));
    }
    public static String crimeAndPunishment(int rating) {
        String tribute;
        switch (rating) {
            case 5:
                tribute = "Велосипед";
                break;
            case 4:
                tribute = "Action Cam GoPro5";
                break;
            case 3:
                tribute = "Награды не будеттб не заслужил";
                break;
            case 2:
                tribute = "Потерянный час времени в жизни и не самое лучшее настроение";
                break;
            case 1:
                tribute ="Познакомимся с ремнем";
                break;
            default:
                tribute ="Такой оценки не существует";
        }
        return tribute;
    }
}
