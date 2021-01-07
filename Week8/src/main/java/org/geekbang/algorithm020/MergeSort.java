package org.geekbang.algorithm020;

public class MergeSort {

    public void mergeSort(int[] array, int left, int right) {
        if (right <= left) {
            return;
        }
        int mid = (left + right) / 2;
        mergeSort(array, left, mid);
        mergeSort(array, mid + 1, right);
        merge(array, left, mid, right);
    }

    private void merge(int[] array, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int n = 0;
        while (i <= mid && j <= right) {
            temp[n++] = array[i] <= array[j] ? array[i++] : array[j++];
        }
        while (i <= mid) {
            temp[n++] = array[i++];
        }
        while (j <= right) {
            temp[n++] = array[j++];
        }
        System.arraycopy(temp, 0, array, left, temp.length);
    }
}
