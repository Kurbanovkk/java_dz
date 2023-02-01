import java.util.Arrays;
import java.util.Random;

public class Les3_dz1 {
    public static void main(String[] args) {
        int[] numArray = new int[15];
        Les2_dz1.fillArr(numArray);
        Les2_dz1.printArray(numArray);
        Les2_dz1.printArray(mergeSort(numArray));
    }

    public static int[] fillArr(int[] numArray) {
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = new Random().nextInt(0, 100);
        }
        return numArray;
    }

    public static void printArray(int[] numArray) {
        System.out.println(Arrays.toString(numArray));

    }

    public static int[] mergeSort(int[] numArray) {
        int[] buffer1 = Arrays.copyOf(numArray, numArray.length);
        int[] buffer2 = new int[numArray.length];
        int[] result = mergeSortInner(buffer1, buffer2, 0, numArray.length);
        return result;
    }

    public static int[] mergeSortInner(int[] buffer1, int[] buffer2, int startIndex, int endIndex) {

        if (startIndex >= endIndex - 1)
            return buffer1;

        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergeSortInner(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = mergeSortInner(buffer1, buffer2, middle, endIndex);

        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;

        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++]
                    : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }
}
