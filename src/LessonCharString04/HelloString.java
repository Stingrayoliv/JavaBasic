package LessonCharString04;

public class HelloString {

    public static void main(String[] args) {
        //goodMorningString();
        stringRelation();
        //upperCase();
        //getArticle();
        //oldDatabase();

    }

    public static void goodMorningString() {
        String firstName = "Петя";
        String lastNAme = "Васечкин";
        char copyright = '\u00A9';
        char copyrightTwo = '©';
        String copyrightStr = "©";
        String space = " ";
        //System.out.println(firstName + space + lastNAme + space + copyright);
    }

    public static void stringRelation() {
        String firstName = "Andrej";
        String lastNAme = "Podlubnyj";
        String emailAdresse = "andron13@gmail.com";
        char copyrightTwo = '©';
        int old = 18;
        System.out.println("Добро пожаловать на сайте: " + firstName + " " + lastNAme);

        String user = firstName + "" + lastNAme + copyrightTwo;
        int lengthDisplay = user.length();
        //System.out.println("Длина строки " + lengthDisplay);

        String magicsSubstring = firstName.substring(2);
        System.out.println(firstName);
        magicsSubstring = emailAdresse.substring(5, 10);
        System.out.println(magicsSubstring);
    }

    public static void upperCase() {
        String text = "Я из лесу вышел, был сильный мороз \n мороз";
        text = text.toUpperCase();
        System.out.println(text);

        String text2 = "ОНИ НАС ОБМАНЫВАЮТ!!!";
        text2 = text2.toLowerCase();
        System.out.println(text2);

    }

    public static void getArticle() {
        String articleTitle = "London is the capital";
        articleTitle = articleTitle.substring(0, 1).toUpperCase() + articleTitle.substring(1);
        System.out.println(articleTitle);

        articleTitle = articleTitle.toUpperCase();
        System.out.println(articleTitle);
        System.out.println(articleTitle.toLowerCase());
    }

    public static void oldDatabase() {
        String number = "10";
        int result = Integer.parseInt(number);
        result = result + 1;
        System.out.println(result);


    }
}

