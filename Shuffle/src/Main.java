import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static final Random random = new Random();
    public static void main(String[] args) throws InterruptedException, IOException {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        Integer b[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int temp, n;
        long startForTime;
        long startShuffleTime;
        double forTime = 0, shuffleTime = 0;
        final int loopNum = 10000000;
        int m = a.length;

        for (int j = 0; j < loopNum; j++) {
            startShuffleTime = System.nanoTime();
            Collections.shuffle(Arrays.asList(b));//★ primitive 배열인경우 asList를 하더라도 단일 객체로 인식하여 섞이지 않는다
            shuffleTime += (System.nanoTime() - startShuffleTime) / (double) 1000;

            startForTime = System.nanoTime();
            for (int i = m; i > 1; i--) {
                n = random.nextInt(a.length);
                temp = a[n];
                a[n] = a[i - 1];
                a[i - 1] = temp;
            }
            forTime += (System.nanoTime() - startForTime) / (double) 1000;
        }
        writer.write("for : ");
        writer.write(Arrays.toString(a));
        writer.newLine();
        writer.write(String.valueOf(forTime / loopNum));
        writer.write(" ns");
        writer.newLine();

        writer.write("shuffle : ");
        writer.write(Arrays.toString(b));
        writer.newLine();
        writer.write(String.valueOf(shuffleTime / loopNum));
        writer.write(" ns");
        writer.newLine();

        writer.flush();
        writer.close();
    }
}
