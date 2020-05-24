package Lesson021;

/**
 * FirstProject
 * 5/22/20 10: 23
 */
public class HelloRecursion {
    public static void main(String[] args) {
//        System.out.println(bunnyEars2(0)); //0
//        System.out.println(bunnyEars2(1)); //2
//        System.out.println(bunnyEars2(2)); //5

        System.out.println(count7(717));// → 2
        System.out.println(count7(7));// → 1
        System.out.println(count7(123));// → 0
        System.out.println(count7(77777));// →

    }

    // 2. We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears.
    // The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot.
    // Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
    //У нас есть очередь из кроликов и мы получаем количество стоящих в этой очереди кроликов. У нечётных кроликов
    // по два уха. А у чётных кроликов вроде как по три уха. Это из-за того, что они все подняли ногу.
    // Посчитайте количество видимых нами "ушей". Не использовать циклы или умножение.
    public static int bunnyEars2(int count) {
        if (count == 0) return 0;// если кроликов совсем нет
        else if (count == 1) return 2;//(если 1 кролик/ нечет / 2 уха)
        else return 5 + bunnyEars2(count - 2); // 5 количество ушей сразу для пары:чет, нечет
    }

    //3. Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2.
    // (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes
    // the rightmost digit (126 / 10 is 12). Дано положительное целочисленное N. Верните количество семёрок в числе.
    // 717 - вернёт 2. Обратите внимание, что модуло 10 даёт вам правую цифру(126 % 10 равно 6), а деление на 10 удалит
    // правую цифру(126 / 10 равно 12). Авторы задачи были к нам слишком добры и практически решили её прямов условии.
    public static int count7(int n) {
        if (n == 0) return 0;
        else if (n % 10 == 7) return 1 + count7(n / 10);
        return count7(n / 10);
    }


}
