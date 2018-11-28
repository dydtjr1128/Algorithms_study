import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Sort {
    private BufferedWriter writer;
    private final int PRINT_NUM;
    private long startTime;
    private int printCount = 0;
    private String algorithmName;
    public Sort() {
        this(100);
        this.algorithmName = getClass().getName();
    }

    public Sort(final int PRINT_NUM) {
        this.PRINT_NUM = PRINT_NUM;
        writer = new BufferedWriter(new OutputStreamWriter(System.out));
        startTime = System.currentTimeMillis();
    }

    protected void printArray(int[] array) throws IOException {
        if (printCount == 0) {
            writer.write("--+ " + algorithmName + " +--\n");
            writer.write("before : ");
        } else {
            writer.write("after : ");
            writer.flush();
        }

        for (int i = 0; i < (array.length > PRINT_NUM ? PRINT_NUM : array.length); i++)
            writer.write(array[i] + " ");
        writer.write("\n");

        printCount++;
    }

    protected void printTime() throws IOException {
        writer.write((System.currentTimeMillis() - startTime) / (double) 1000 + "ms\n\n");
        writer.flush();
    }
}
