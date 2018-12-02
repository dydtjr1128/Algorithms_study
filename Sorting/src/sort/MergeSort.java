package sort;

import java.io.IOException;

public class MergeSort extends Sort {
    private int tempArray[];

    public void sort(int[] array, final boolean isAscending) throws IOException {
        printArray(array);
        tempArray = new int[array.length];
        mergeSort(array, 0, array.length - 1, isAscending);
        printArray(array);
        printTime();
    }

    private void mergeSort(int[] array, int start, int end, final boolean isAscending) {
        int mid;
        if (start < end) {
            mid = (start + end) / 2;
            mergeSort(array, start, mid, isAscending);
            mergeSort(array, mid + 1, end, isAscending);
            merge(array, start, mid, end);
        }
    }

    private void merge(int[] array, int start, int mid, int end) {
        int i, j, k, l;
        i = start;
        j = mid + 1;
        k = start;
        while (i <= mid && j <= end) {
            if (array[i] <= array[j])
                tempArray[k++] = array[i++];
            else
                tempArray[k++] = array[j++];
        }

        if (i > mid) {
            for (l = j; l <= end; l++)
                tempArray[k++] = array[l];
        } else {
            for (l = i; l <= mid; l++)
                tempArray[k++] = array[l];
        }

        /*for (l = start; l <= end; l++)
            array[l] = tempArray[l];*/
        System.arraycopy(tempArray,start,array,start,end-start+1);
    }
}
