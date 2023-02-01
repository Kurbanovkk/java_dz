
import java.util.ArrayList;
import java.util.Random;

// Пусть дан произвольный список целых чисел, удалить из него четные числа
public class Les3_dz2 {
    static Random random = new Random();

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(15);
        fillArr(arrayList);
        printArray(arrayList);
        arrayList.removeIf(i -> i % 2 == 0);
        System.out.println("\n********");
        printArray(arrayList);

    }

    public static ArrayList<Integer> fillArr(ArrayList<Integer> arrayList) {
        for (int i = 0; i < 20; i++) {
            arrayList.add(random.nextInt(0, 100));
        }
        return arrayList;
    }

    public static void printArray(ArrayList<Integer> arrayList) {
        for (int iterable_element : arrayList) {
            System.out.println(iterable_element);
        }

    }
}
