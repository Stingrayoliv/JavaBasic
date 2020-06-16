package obj;

/**
 * FirstProject
 * 6/16/20 12: 36
 */
public class StartTres {
    public static void main(String[] args) {
        Duck greyDuck = new Duck(); // новый экземпяр
        greyDuck.age = 4;
        greyDuck.breed = "anasPlatyrhynchos";
        greyDuck.color = "grey";
        greyDuck.flies();
    }
}
