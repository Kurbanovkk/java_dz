/*Реализовать простой калькулятор */

import java.util.Scanner;

public class Les1_dz3 {
    public static void main(String[] args) {
        boolean flag = false;
        Scanner scann = new Scanner(System.in);
        while (flag != true) {
            System.out.println("введите первое число:");
            Double value1 = scann.nextDouble();
            System.out.println("введите второе число:");
            Double value2 = scann.nextDouble();
            System.out.println("Выберите действие: '+', '-', '*', '/' ");
            char ch = scann.next().charAt(0);
            Double res = 0.0;
            /*
             * switch (char_) {
             * case '+':
             * res = value1 + value2;
             * break;
             * case '-':
             * res = value1 - value2;
             * break;
             * case '*':
             * res = value1 * value2;
             * break;
             * case '/':
             * res = value1 / value2;
             * break;
             */

            if (ch == '+')
                res = value1 + value2;
            else if (ch == '-')
                res = value1 - value2;
            else if (ch == '*')
                res = value1 * value2;
            else if (ch == '/')
                res = value1 / value2;

            System.out.println(res);
            System.out.println("Чтобы продолжить нажмите 1, а чтоб остановить 0 ");
            int stop = scann.nextInt();
            if (stop == 0)
                flag = true;

        }
    }
}
