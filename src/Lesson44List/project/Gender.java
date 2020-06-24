package Lesson44List.project;

/**
 * FirstProject
 * 6/24/20 12: 45
 */
public enum Gender { //enum - нумерованный список
    MALE(1), // писать большими буквами
    FEMALE(2),
    DIVERSE(3), // последний элемент только ;
    FOR(4);

    private int gender;

    Gender(int gender) {
        this.gender = gender;
    }

    public int getGender() { // формирование нумерированного списка
        return gender;
    }
}
