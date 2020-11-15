package chapter2.exercises;

import java.util.Arrays;

/**
 * page 22:2.3-4
 *
 * @author aixiaobai
 * @date 2020/11/12 23:53
 */
public class InsertRecursionSort {


    private void solve(int[] array, int r) {
        int target = array[r + 1];
        int i = r;
        while (i > -1) {
            if (target < array[i]) {
                array[i + 1] = array[i];
                array[i] = target;
                i--;
            } else {
                break;
            }
        }
    }

    public void sort(int[] array, int r) {
        if (r > 0) {
            r--;
            sort(array, r);
            solve(array, r);
        }

    }

    public static void main(String[] args) {
        int[] array = {2, 5, 6, 8, 9, 5, 3, 6, 7, 0, 4};
        InsertRecursionSort solution = new InsertRecursionSort();
        solution.sort(array, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

}
