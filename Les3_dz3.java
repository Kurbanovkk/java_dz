import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

public class Les3_dz3 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(15);
        Les3_dz2.fillArr(arrayList);
        Les3_dz2.printArray(arrayList);
        findMinMaxAverage(arrayList);
        findMinMaxAverageCollections(arrayList);

    }

    public static void findMinMaxAverage(ArrayList<Integer> list) {
        Iterator<Integer> col = list.iterator();
        int min = list.get(0);
        int max = list.get(0);
        double res = 0;

        while (col.hasNext()) {
            int i = (Integer) col.next();
            if (i < min)
                min = i;
            if (i > max)
                max = i;
            res = res + i;
        }
        System.out.println("Вариант 1");
        System.out.printf("Мин значние: %s\n", min);
        System.out.printf("Макс значение: %s\n", max);
        System.out.printf("Среднее значение: %.2f\n", res / list.size());
    }

    public static void findMinMaxAverageCollections(ArrayList<Integer> list) {
        System.out.println("\n Вариант 2");
        System.out.printf("Мин значение: %s\n", Collections.min(list));
        System.out.printf("Макс значение: %s\n", Collections.max(list));
        Double average = list.stream().mapToInt(val -> val).average().orElse(0.0);
        System.out.printf("среднее значение: %f\n", average);
    }
}
