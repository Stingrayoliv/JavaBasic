package LessonBoolean05;

/**
 * Занятие №5 Boolean
 * FirstProject
 * 4/27/20 11: 24
 */
public class HelloBoolean {
    public static void main(String[] args) {
        //myBolean();
        // youNotMe();
        //System.out.println("Ребенок и карманные деньги: " + yourOrMe());
        //System.out.println("Два офицера с ключами: " + yourAndMe());
        System.out.println("Отпуск удался? " + vacation());
    }
    public static boolean vacation() {
        boolean alpy = true;
        boolean babushka = true;
        boolean iAmHappy = alpy ^ babushka; // "исключительное или" я у бабушки, или я в Альпах
        return iAmHappy;
    }
    public static boolean yourAndMe() {
        boolean officerOne = true;
        boolean officerTwo = false;
        boolean result = officerOne & officerTwo;
        return result;

    }

    public static boolean yourOrMe () {
        boolean papa = true;
        boolean mama = true;
        boolean child = papa | mama; // или папа, или мама должны деть деньги на мороженное

        return child;
    }

    public static void myBolean() {
        int a = 1;
        int b = 2;
        boolean boolTwo = false;
        boolean boolThree = true;
        boolean boolOne = a <= b;
        boolean boolFor = a >= b;
        System.out.println(boolOne);
        System.out.println(boolFor);
        // Смартфоныб которые дешевле 500 евро, новые, c андроид версией 9 и выше
    }

    public static void youNotMe() {
        boolean a = true;
        boolean b = !a; // не равно а, то есть false
        System.out.println(b);

    }

}
