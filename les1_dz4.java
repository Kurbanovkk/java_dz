
/**
 * +Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть
 * заменены знаком вопроса, например 2? + ?5 = 69.
 * Требуется восстановить выражение до верного равенства. Предложить хотя бы
 * одно решение или сообщить, что его нет.
 */
import java.util.Scanner;

public class les1_dz4 {
    public static void main(String[] args) {
        System.out.println("Дано : 4? + ?5 = 69");
        int flag = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (40 + i + j * 10 + 5 == 69) {
                    flag += 1;
                    System.out.println(flag + ") 4" + i + " + " + j + "5" + " = 69");
                }
            }
        }
        System.out.println("\n");
        if (flag == 0) {
            System.out.println("Решений нет\n");
        }
    }

}
