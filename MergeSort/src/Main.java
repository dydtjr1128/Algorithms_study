import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

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


    private static void mergeSort(int[] array, final boolean isAscending) {

    }
}
