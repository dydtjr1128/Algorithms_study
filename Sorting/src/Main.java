import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        final int ARRAY_NUM = 50000;
        int array[] = RandomArray.makeRandomArray(ARRAY_NUM);
        int temp[] = array.clone();

        new BubbleSort().sort(temp,true);

        temp = array.clone();
        new InsertionSort().sort(temp,true);

        temp = array.clone();
        new MergeSort().sort(temp,true);
    }
}
