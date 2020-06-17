package obj;

import java.util.Arrays;

/**
 * FirstProject
 * 6/16/20 11: 59
 */
public class StartDos {
    public static void main(String[] args) {
        Person sasha, dasha, pasha, glasha;

        Person misha = new Person(100, 185);
        // конструктор
        // дефолтный, пустой, с параметрами

        System.out.println(misha.height);
        misha.findBmiClassIndex();
        System.out.println(misha.bmi);

        sasha = new Person();

        dasha = new Person(65, 185);
        System.out.println("Индекс массы тела Даши " + dasha.bmi);
        pasha = new Person();
        glasha = new Person();

        Person[] bm13morning = {sasha, pasha, glasha, misha};
        glasha.myPrint();
        System.out.println(Arrays.toString(bm13morning));



    }
}
