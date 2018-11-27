import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

//폰 노이만이 제안
public class Main {
    static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
    final static int PRINT_NUM = 100;
    final static int RANDOM_NUM = 10000;

    public static void main(String[] args) throws IOException {
        int array[] = RandomArray.makeRandomArray(RANDOM_NUM);

        printArray(array);

        long startTime = System.currentTimeMillis();
        mergeSort(array, true);//true : ascending
        long endTime = System.currentTimeMillis();

        printArray(array);

        writer.write((endTime - startTime) / (double) 1000 + "ms");
        writer.flush();
        writer.close();
    }

    private static void printArray(int[] array) throws IOException {
        for (int i = 0; i < (array.length > PRINT_NUM ? PRINT_NUM : array.length); i++)
            writer.write(array[i] + " ");
        writer.write("\n");
    }

    private void mergeSort(int[] array, final boolean isAscending) {
        mergeSort(array, 0, array.length, isAscending);
    }

    private static void mergeSort(int[] array, int start, int end, final boolean isAscending) {
        int mid;
        if (start < end) {
            mid = (start + end) / 2;
            mergeSort(array, start, mid, isAscending);
            mergeSort(array, mid + 1, end, isAscending);
            merge(array, 0, mid, array.length);
        }
    }

    private static void merge(int[] array, int i, int mid, int length) {

    }

}
