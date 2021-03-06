package chapter2.insertion;

import java.util.Arrays;

/**
 * 插入排序
 * @author aixiaobai
 * @date 2020/8/3 23:40
 */
public class InsertionSort {

    /**
     * Time Complexity : O(n^2)
     * Space Complexity : O(1)
     */
    public void solution(int[] array) {
        if (array == null || array.length < 2) {
            return;
        }
        for (int i = 1; i < array.length; i++) {
            int j = i - 1;
            int tmp = array[i];
            while (j > 0 && array[j] > tmp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = tmp;
        }
    }

    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        int[] array = {2, 5, 10, 3, 6, 5, 9};
        insertionSort.solution(array);
        System.out.println(Arrays.toString(array));
    }
}
