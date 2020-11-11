package chapter2.merge;

import java.util.Arrays;

/**
 * 归并排序
 *
 * @author aixiaobai
 * @date 2020/11/11 23:37
 */
public class MergeSort {


    private void merge(int[] array, int p, int q, int r) {
        int n = q - p + 1;
        int m = r - q;
        int[] left = new int[n + 1];
        int[] right = new int[m + 1];
        for (int i = 0; i < n; i++) {
            left[i] = array[p + i];
        }
        for (int i = 0; i < m; i++) {
            right[i] = array[q + 1 + i];
        }
        left[n] = Integer.MAX_VALUE;
        right[m] = Integer.MAX_VALUE;
        int a = 0;
        int b = 0;
        for (int i = p; i < r + 1; i++) {
            if (left[a] > right[b]) {
                array[i] = right[b];
                b++;
            } else {
                array[i] = left[a];
                a++;
            }
        }
    }

    public void mergeSort(int[] array, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            mergeSort(array, p, q);
            mergeSort(array, q + 1, r);
            merge(array, p, q, r);
        }
    }


    public static void main(String[] args) {
        MergeSort merge = new MergeSort();
        int[] array = {2, 5, 6, 8, 9, 5, 3, 6, 7};
        merge.mergeSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }
}
