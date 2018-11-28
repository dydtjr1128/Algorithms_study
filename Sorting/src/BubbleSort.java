import java.io.IOException;

public class BubbleSort extends Sort {

    public void sort(int[] array, final boolean isAscending) throws IOException {
        int temp;
        printArray(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (isAscending) {
                    if (array[i] > array[j]) {
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                } else {
                    if (array[i] < array[j]) {
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }
        printArray(array);
        printTime();
    }
}
