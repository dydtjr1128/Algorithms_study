public class RandomArray {
    public static int[] makeRandomArray(int n) {
        int value[] = new int[n];
        for (int i = 0; i < n; i++) {
            value[i] = ((int) (Math.random() * n) + 1);
        }
        return value;
    }
}
