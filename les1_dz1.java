
/**
 * les1_dz1
 */

/*Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n) */

import java.util.Scanner;

public class les1_dz1 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите пожалуйста число n: ");
        int n = iScanner.nextInt();
        System.out.println(cornered(n));
        System.out.println(factor(n));
    }

    static int cornered(int n) {
        if (n == 1)
            return 1;

        return n + cornered(n - 1);
    }

    static int factor(int n) {
        if (n == 1 || n == 0)
            return 1;
        return n * factor(n - 1);
    }

}