import sort.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        final int ARRAY_NUM = 300000;
        int array[] = RandomArray.makeRandomArray(ARRAY_NUM);
        int temp[] = array.clone();
        final boolean isAscending = true;
       /* new BubbleSort().sort(temp, true);*/

        temp = array.clone();
        new InsertionSort().sort(temp, isAscending);

        temp = array.clone();
        new MergeSort().sort(temp, isAscending);

        temp = array.clone();
        new QuickSort().sort(temp, isAscending);

        temp = array.clone();
        new CountingSort().sort(temp, isAscending);
    }
}
