package HomeworkAll;

/**
 * Homework №4 String and Char
 */
public class HomeworkString {
    public static void main(String[] args) {
        getSymbolsChar();
        displayNameAndProfession();
        getDataUser();
        getPhrase();
        getUpperPhrase();
        getSymbolsChar();
    }

    // Найти "смешные" символы, символ стандартного смайлика, найти символ телефона, параграфа, копирайта(C),
    // торговой марки(тм), рубля, евро, доллара, знаков зодиака, шахмат, червы.
    public static void getSymbolsChar() {
        char smile = '\u263A';
        char phone = '\u260E';
        char paragraph = '\u2761';
        char copyright = '\u00A9';
        char tradeMark = '\u2122';
        char eur = '\u20AC';
        char zodiacSign = '\u2648';
        char chess = '\u2655';
        char symbol = '\u2665';
        char doll = '\u0024';
        System.out.println("Символы: " + smile + "" + phone + " " + paragraph + " " + copyright + " " + tradeMark
                + " " + eur + " " + zodiacSign + " " + chess + " " + symbol + " " + doll);
    }

    // Вывести на экран сообщение в кавычках. Например собственное имя + "профессия".
    public static void displayNameAndProfession() {
        String myName = "\"Maria\""; // используем экранирование для вывода двойных кавычек
        String myProfession = "\"Scientist\""; // используем экранирование для вывода двойных кавычек
        System.out.println("Name: " + myName + "\nProfession: " + myProfession);

        // второй вариант вывода через printf для String
        System.out.printf("Name: %s \nProfession: %s", myName, myProfession);
    }

    // Вывести на экран построчно анкетные данные: Имя, Фамилия, Адрес, Улица и тд и тп. Пример вывода одной строчки:
    //- Имя пользователя: Андрей
    public static void getDataUser() {
        String nameUser = "Michael";
        String surnameUser = "Robson";
        String streetUser = "Rosenheimer";
        String houseNumberUser = "195";
        String postIndexUser = "10781";
        String cityUser = "Berlin";
        System.out.println("\nName: " + nameUser + "\nSurname: " + surnameUser + "\nStreet: " + streetUser +
                "\nHouse number: " + houseNumberUser + "\nIndex: " + postIndexUser + "\nCity: " + cityUser);
    }

    // Вырезать из выражения "Вход разрешён" последние 8 символов и добавить "воспрещён".
    public static void getPhrase() {
        // решение c помощью substring()
        String phraseUser = "Вход разрешён";
        String newPhraseUser = "Воспрещен";
        System.out.println("\"" + phraseUser.substring(0, 4) + " " + newPhraseUser.toLowerCase() + "!" + "\"");

        // второй вариант через метод replace для String
        System.out.println("\"" + phraseUser.substring(0, 4) + " " +
                phraseUser.substring(0, 4).replace(phraseUser.substring(0, 4), newPhraseUser.toLowerCase() +
                "!" + "\""));
    }

    //Вывести на экран "Осторожно, вход воспрещён" заглавными буквами.
    public static void getUpperPhrase() {
        String PhraseWarning = "\"Осторожно, вход воспрещён\"";
        System.out.println(PhraseWarning.toUpperCase());
    }
}
