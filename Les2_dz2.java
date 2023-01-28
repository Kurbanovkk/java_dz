
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.*;

public class Les2_dz2 {
    public static void main(String[] args) throws SecurityException, IOException {
        boolean flag = false;
        Scanner scann = new Scanner(System.in);
        Logger logger = Logger.getLogger((Les2_dz2.class.getName()));
        ConsoleHandler ch = new ConsoleHandler();
        logger.addHandler(ch);

        SimpleFormatter sFormat = new SimpleFormatter();
        ch.setFormatter(sFormat);

        try {

            while (flag != true) {
                System.out.println("введите первое число:");
                Double value1 = scann.nextDouble();
                System.out.println("введите второе число:");
                Double value2 = scann.nextDouble();
                System.out.println("Выберите действие: '+', '-', '*', '/' ");
                char chr = scann.next().charAt(0);
                Double res = 0.0;

                if (chr == '+')
                    res = value1 + value2;
                else if (chr == '-')
                    res = value1 - value2;
                else if (chr == '*')
                    res = value1 * value2;
                else if (chr == '/')
                    res = value1 / value2;

                logger.info("Действие калькулятора выполнено успешно");

                System.out.println(res);
                System.out.println("Чтобы продолжить нажмите 1, а чтоб остановить 0 ");
                int stop = scann.nextInt();
                if (stop == 0)
                    flag = true;
                logger.info("Файл записан успешно");
            }
        } catch (Exception e) {
            logger.log(Level.WARNING, "ошибка");

        }
    }
}