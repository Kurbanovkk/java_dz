import java.util.Arrays;
import java.util.Random;
import java.util.logging.*;

public class Les2_dz1 {
    static Logger logger = Logger.getLogger((Les2_dz1.class.getName()));

    public static void main(String[] args) {
        int[] numArray = new int[15];

        ConsoleHandler ch = new ConsoleHandler();
        logger.addHandler(ch);

        SimpleFormatter sFormat = new SimpleFormatter();
        ch.setFormatter(sFormat);

        numArray = fillArr(numArray);
        printArray(numArray); // до сортировки
        bubbleSort(numArray);
        printArray(numArray); // после
    }

    public static int[] fillArr(int[] numArray) {
        try {
            for (int i = 0; i < numArray.length; i++) {
                numArray[i] = new Random().nextInt(0, 100);
            }
            logger.info("Метод заполнения массива отработал успешно");
        }

        catch (Exception e) {
            logger.log(Level.WARNING, "ошибка");

        }
        return numArray;
    }

    public static void bubbleSort(int[] numArray) {
        try {
            for (int i = 0; i < numArray.length; i++) {
                for (int j = 0; j < numArray.length - 1; j++) {
                    if (numArray[j] > numArray[j + 1]) {
                        bubble(numArray, j, j + 1);
                    }
                }
            }

            logger.info("Метод сортировки массива отработал успешно");
        }

        catch (Exception e) {
            logger.log(Level.WARNING, "ошибка");

        }
    }

    public static void bubble(int[] numArray, int a, int b) {
        int temp = numArray[a];
        numArray[a] = numArray[b];
        numArray[b] = temp;
    }

    public static void printArray(int[] numArray) {
        try {
            System.out.println(Arrays.toString(numArray));

            logger.info("Метод вывода массива отработал успешно");
        }

        catch (Exception e) {
            logger.log(Level.WARNING, "ошибка");

        }

    }
}