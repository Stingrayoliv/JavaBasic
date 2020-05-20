package LessonCharString04;

public class HelloChar {
    public static void main(String[] args) {
        getMeMYRandomDigit();
    }
        //char digits = 100;
        char symbol = '\u039A';
        //char symbolTwo = ;
        char tabulator = '\t';
        char littleU = '\350';
        //char pe = '\U220';

        //System.out.println(digits);
        //System.out.println(symbol);
        //System.out.println(symbolTwo);
        //System.out.println(tabulator);
        //System.out.println(littleU);

        public static void getMeMYRandomDigit() {
            final int MIN = 30;
            final int MAX = 100;

            int randomDigits = (int) (Math.random() * (MAX - MIN)) + MIN;
            char randomChar = (char) randomDigits;
            System.out.println(randomChar);


    }

}
