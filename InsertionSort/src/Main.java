import java.io.*;

public class Main {
    static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
    final static int PRINT_NUM = 100;
    final static int RANDOM_NUM = 10000;

    public static void main(String[] args) throws IOException {
        int array[] = RandomArray.makeRandomArray(RANDOM_NUM);

        printArray(array);

        long startTime = System.currentTimeMillis();
        insertionSort(array, true);//true : ascending
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


    private static void insertionSort(int[] array, final boolean isAscending) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            for (int j = i - 1; j >= 0 && array[j] > key; j--) {
                if (isAscending) {
                    if (array[i] < array[j]) {

                    }
                } else {

                }
            }
        }
    }
}
