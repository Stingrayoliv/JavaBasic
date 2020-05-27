package Lesson023;
/**
 * FirstProject
 * 5/26/20 11: 36
 */
public class HelloArrays {
    public static void main(String[] args) {
        // dataType[] arrayName;
        int[] myVariable;
        String[] myString;
        double[] gpsPoints;
        boolean[] truthTable;
        char[] cyrillicAlphabet;

        int[] field;
        field = new int[10]; // в массиве 10 целочисленных элементов;

        String[] fourSeasons = new String[]{"Вивальди", "Чайковский", "Astor Piazzolla", "Stephen Edwin King"};
        int[] numberFibonacci = new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144};
        String[] capitalCitiesUdSSR = new String[]{"Москва", "Киев", "Минск", "Рига", "Ереван"};
        String[] cccpCities = new String[15];
        String[] germanCity = new String[]{"Berlin", "München", "Dresden", "Hamburg", "Köln", "Potsdam"};
        //germanCities();
        //magicBoolean();
        magicArray(2020, "a", "b", "c");
    }

    private static void germanCities() {
        String[] germanCity = new String[]{"Berlin", "München", "Dresden", "Hamburg", "Köln", "Potsdam", "Leipzig"};
        int allGermanCity = germanCity.length;
        System.out.println(allGermanCity);

        int allLetterInCities = 0;

        for (int i = 0; i < germanCity.length; i++) {
            allLetterInCities = allLetterInCities + germanCity[i].length();
        }
        System.out.println(allLetterInCities);
    }

    private static void oldDeclaration() {
        // dataType arrayName[];
        int myArray[];
        String user[];
        double gpsPoints[];
        boolean truthTable[];
        char cyrillicAlphabet[];
    }

    public static void magicBoolean() {
        boolean[] truthTable;
        truthTable = new boolean[10];

        for (int i = 0; i < truthTable.length; i++) {
            System.out.println(truthTable[i]);
        }

        int[] myIntArray = new int[10];
        for (int i = 0; i < myIntArray.length; i++) {
            System.out.println(myIntArray[i]);
        }

        char[] myCharArray = new char[10];

        for (int i = 0; i < myCharArray.length; i++) {
            System.out.println(myCharArray[i]);
        }

        String[] myLovelyArray = new String[10];
        for (String stringElement : myLovelyArray) {
            System.out.println(stringElement);
        }
    }

    public static void magicArray(int year, String... values) {
        //varargs
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
    }

}

