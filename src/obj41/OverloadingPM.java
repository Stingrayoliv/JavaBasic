package obj41;

/**
 * FirstProject
 * 6/19/20 09: 50
 * Полиморфизм состоит из 2-х вещей. Тут одна из них: OverloadingPM
 */
public class OverloadingPM {
    public static void main(String[] args) {
        int a =10;
    }
    private static void myPrint(int digit) {
        System.out.println("Эта цифра в методе майПринт" +digit);
    }
    private static void myPrint() {
        System.out.println("Это просто принт");
    }
    private static void myPrint(String s, int digit) {
        System.out.println("Это не просто принт, а принт со стрингом и интом");
    }
}
