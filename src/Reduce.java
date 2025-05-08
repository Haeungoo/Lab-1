import java.util.Scanner;

public class Reduce {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        reduceNumberTo0(number);
    }

    private static void reduceNumberTo0(int n) {
        int step = 0;
        while (n != 0) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n -= 1;
            }
            step++;
        }
        System.out.println(step);
    }

}