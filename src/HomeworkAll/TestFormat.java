package HomeworkAll;

public class TestFormat {

    public static void main(String[] args) {
        String nameUser = "David";
        int ageUser = 45;
        double balanceUser = 515.48;
        System.out.printf(" Hi %s!\n", nameUser); // %s используется для форматирования String;
        System.out.printf("You are %d years old\n", ageUser); // %d используется для десятичного целого;
        System.out.printf("You have %.2f%n", balanceUser); // возможность в данном методе \n заменить на %n

        System.out.printf("Hi %s! You are %d years old. You have %.2f", nameUser, ageUser, balanceUser);

        double pi = Math.PI;
        System.out.println("Значение числа Пи: " + pi);
        System.out.printf("Значение числа Пи: %.2f", pi); // printf использовался для окургления числа Пи
    }
}
