package Lesson44List;
/**
 * FirstProject
 * 6/24/20 11: 25
 */
public class Fractal { // смотрим дроби простые 2/3
    int numerator; //числитель
    int denominator; // знаменатель

    public Fractal() {
    }

    public Fractal(int numerator) {
        this.numerator = numerator;
        this.denominator = 1;
    }

    public Fractal(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    // toString и предлагает выбрать что распечатать автоматически
    @Override
    public String toString() {
        return "Fractal{" +
                "Дробь сделана в Берлине \n" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }

    public static Fractal addition(Fractal fr1, Fractal fr2) {
        Fractal fr3 = new Fractal();
        fr3.denominator = fr1.denominator * fr2.denominator;
        fr3.numerator
                = fr1.numerator * fr2.denominator
                + fr2.numerator * fr1.denominator;
        return fr3;
    }

    public Fractal addition(Fractal fr2) {
        int denominator = fr2.denominator * this.denominator;
        int numerator = this.numerator * fr2.denominator
                + fr2.numerator * this.denominator;
        Fractal fr3 = new Fractal(numerator, denominator);
        //addition(fr2, this);
        return fr3;
    }
}

class FractalTest {
    public static void main(String[] args) {
        Fractal fr1 = new Fractal(2, 3);
        System.out.println(fr1.toString());
        Fractal fr2 = new Fractal(4, 5);

        Fractal fr3 = Fractal.addition(fr1, fr2);
        Fractal fr4 = fr1.addition(fr2);
        System.out.println(fr3);
        System.out.println(fr4);
    }
}
