
/*Вывести все простые числа от 1 до 1000 */
import java.util.ArrayList;

public class Les1_dz2 {
    public static void main(String[] args) {
        for (int i = 2; i < 1000; i++) {
            if (simple(i))
                System.out.println(i);
        }

    }

    public static boolean simple(int num) {
        for (int x = 2; x < num; x++) {
            if (num % x == 0) {
                return false;
            }
        }
        return true;
    }
}
