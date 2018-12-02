package sort;

import java.io.IOException;

public class QuickSort extends Sort {
    int temp;

    public void sort(int[] array, final boolean isAscending) throws IOException {
        printArray(array);
        quickSort(array, 0, array.length - 1, isAscending);
        printArray(array);
        printTime();
    }

    private void swap(int array[], int a, int b) {
        temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    private void quickSort(int[] array, int start, int end, final boolean isAscending) {
        if (start < end) {
            int q = partition(array, start, end);//피벗의 위치 계산

            quickSort(array, start, q - 1, isAscending); // 피벗을 기준으로 좌 우 sort
            quickSort(array, q + 1, end, isAscending);
        }
    }

    private int partition(int[] array, int start, int end) {
        int pivot;
        int low, high;
        low = start;
        high = end + 1;
        pivot = array[start];// 임의로 가장 왼쪽을 피벗으로 설정
        do {
            do {
                low++;
            } while (low <= end && array[low] < pivot);//피벗보다 커지는 위치

            do {
                high--;
            } while (high >= start && array[high] > pivot); // 피벗보다 작아지는 위치

            if (low < high)
                swap(array, high, low);
        } while (low < high);

        swap(array, start, high);//피벗의 위치를 변경 왼쪽은 high보다 작은 수

        return high;// 피벗의 위치를 교차한 곳으로 변경
    }

}
