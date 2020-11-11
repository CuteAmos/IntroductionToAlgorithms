package chapter2.selection;

import java.util.Arrays;

/**
 * 选择排序
 * @author aixiaobai
 * @date 2020/8/4 22:28
 */
public class SelectionSort {

    /**
     * Time Complexity : O(n^2)
     * Space Complexity : O(1)
     */
    public void solution(int[] array) {
        int min;
        int key;
        for (int j = 0; j < array.length - 1; j++) {
            min = array[j];
            key = j;
            for (int i = j; i < array.length; i++) {
                if(min > array[i]){
                    min = array[i];
                    key = i;
                }
            }
            array[key] = array[j];
            array[j] = min;
        }

    }

    public static void main(String[] args) {
        int[] array = {2, 5, 10, 3, 6, 5, 9};
        new SelectionSort().solution(array);
        System.out.println(Arrays.toString(array));
    }
}
