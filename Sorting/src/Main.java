import sort.BubbleSort;
import sort.InsertionSort;
import sort.MergeSort;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        final int ARRAY_NUM = 100000;
        int array[] = RandomArray.makeRandomArray(ARRAY_NUM);
        int temp[] = array.clone();

        //new BubbleSort().sort(temp, true);

        temp = array.clone();
        new InsertionSort().sort(temp, true);

        temp = array.clone();
        new MergeSort().sort(temp, true);

    }
}
