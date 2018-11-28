import java.io.IOException;

public class InsertionSort extends Sort {
    public void sort(int[] array, final boolean isAscending) throws IOException {
        printArray(array);
        int i, j;
        for (i = 1; i < array.length; i++) {
            int key = array[i];
            if (isAscending) {
                for (j = i - 1; j >= 0 && array[j] > key; j--) {
                    array[j + 1] = array[j];
                }
            } else {
                for (j = i - 1; j >= 0 && array[j] < key; j--) {
                    array[j + 1] = array[j];
                }
            }
            array[j + 1] = key;

        }
        printArray(array);
        printTime();
    }
}
