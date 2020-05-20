package HomeworkAll;
import javax.swing.plaf.nimbus.AbstractRegionPainter;
import java.util.Scanner;
/**
 * FirstProject
 * 5/14/20 14: 58
 */

public class HomeworkPlay016 {
    public static void main(String[] args) {
        int a = 1;
        int n = 100;
        guessNumber(a, n);
    }

    // Компьютер загадывает число от 1 до n. У пользователя k попыток отгадать. После каждой неудачной попытки компьютер
    // сообщает меньше или больше загаданное число. В конце игры текст с результатом
    // (или “Вы угадали”, или “Попытки закончились”).
    public static void guessNumber(int min, int max) {
        int kMax = 0; // максимальнок количество попыток в уровек в зависимости от уровня
        int numberPlayer;
        int levelDifficulty = 0;
        Scanner sc = new Scanner(System.in);
        String resultFirst = "Вы угадали!" ;
        String resultSecond = "Загаданое число больше выбраного Вами";
        String resultThree = "Загадано число меньше выбраного Вами";
        String resultFour = "Попытки закончились!";
        int randomNumber = (int) (Math.random() * (max - min)) + min;
        System.out.println("случайное число / для проверки: " + randomNumber);

        System.out.println("Выбере уровень сложности о 1 до 3-х: ");
        levelDifficulty = sc.nextInt();

        switch (levelDifficulty){
            case 1:
                kMax = 10;
                break;
            case 2:
                kMax = 6;
                break;
            case 3:
                kMax = 3;
                break;
            default:
                System.out.println("уровень сложности не сущетсвует");
        }

        if(kMax > 0) {
            System.out.println("количество попыток: " + kMax);


            int i = 1;
            do {
                System.out.println("НОМЕР ПОПЫТКИ: " + i);
                System.out.println("Назовите число от " + min + " до " + max);
                numberPlayer = sc.nextInt();

                if (numberPlayer == randomNumber) {
                    System.out.println(resultFirst);
                } else if (numberPlayer < randomNumber) {
                    System.out.println(resultSecond);
                } else if (numberPlayer > randomNumber) {
                    System.out.println(resultThree);
                }
                i++;
            } while (numberPlayer == randomNumber ^ i <= kMax);
            // условие выхода из цикла: угадали ИЛИ мак кол-во попыток;
            System.out.println(resultFour);
        }
    }
}
