public class Multiples {
    public static void main(String[] args) {
        countMultiplesOf3Or5();
    }

    private static void countMultiplesOf3Or5() {
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }

}
