import java.util.Arrays;

public class Les5_dz3 {
    public static void main(String[] args) {

        int[] arr = { 12, 11, 13, 5, 6, 7 };
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void sort(int[] arr) {
        int n = arr.length;

        // Строим бинарную кучу (heap)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // Извлекаем элементы из кучи
        for (int i = n - 1; i >= 0; i--) {
            // Перемещаем текущий корень в конец массива
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Перестраиваем кучу
            heapify(arr, i, 0);
        }
    }

    // Функция для перестройки кучи
    static void heapify(int[] arr, int n, int i) {
        int largest = i; // Инициализируем наибольший элемент как корень
        int l = 2 * i + 1; // Левый потомок узла
        int r = 2 * i + 2; // Правый потомок узла

        // Если левый потомок больше корня
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // Если правый потомок больше наибольшего элемента на данный момент
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // Если наибольший элемент не корень
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Рекурсивно перестраиваем поддерево
            heapify(arr, n, largest);
        }
    }
}
