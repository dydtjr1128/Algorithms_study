package sort;

import java.io.IOException;

public class CountingSort extends Sort {
    int temp;

    public void sort(int[] array, final boolean isAscending) throws IOException {
        printArray(array);
        int countingArray[] = countingSort(array);
        printArray2(countingArray);
        printTime();
    }

    protected void printArray2(int[] countingArray) throws IOException {

        writer.write("after : ");
        writer.flush();
        int cc = 0;
        int len = countingArray.length;
        for (int i = 0; i < len && cc < 100; i++) {
            if (countingArray[i] != 0) {
                for (int j = 0; j < countingArray[i] && cc < 100; j++) {
                    writer.write(i + " ");
                    cc++;
                }
            }
        }
        writer.write("\n");
    }

    private int[] countingSort(int[] array) {
        int len = array.length;
        int[] countingArray = new int[len + 1];
        for (int i = 0; i < len; i++) {
            countingArray[array[i]]++;
        }
        return countingArray;
    }
}
