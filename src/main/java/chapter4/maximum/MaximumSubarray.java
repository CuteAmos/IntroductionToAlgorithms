package chapter4.maximum;

import java.util.Arrays;

/**
 * 求最大子数组
 *
 * @author aixiaobai
 * @date 2020/11/21 22:23
 */
public class MaximumSubarray {

    public int[] findMaxCrossingSubarray(int[] array, int low, int mid, int high) {
        int sum = 0;
        int leftSum = Integer.MIN_VALUE;
        int maxLeft = 0;
        for (int i = mid; i >= low; i--) {
            sum += array[i];
            if (sum > leftSum) {
                leftSum = sum;
                maxLeft = i;
            }
        }
        int rightSum = Integer.MIN_VALUE;
        int maxRight = 0;
        sum = 0;
        for (int i = mid + 1; i <= high; i++) {
            sum += array[i];
            if (sum > rightSum) {
                rightSum = sum;
                maxRight = i;
            }
        }
        return new int[]{maxLeft, maxRight, leftSum + rightSum};
    }

    public int[] findMaximumSubarray(int[] array , int low, int high){
        if (low == high){
            return new int[] {low,high,array[low]};
        }
        int mid = (low + high)/2;
        int[] maxLeft,maxRight,maxCrossing;
        maxLeft = findMaximumSubarray(array,low,mid);
        maxRight = findMaximumSubarray(array,mid+1,high);
        maxCrossing = findMaxCrossingSubarray(array,low,mid,high);
        if(maxLeft[2] > maxRight[2] && maxLeft[2] > maxCrossing[2]){
            return maxLeft;
        }else if(maxRight[2] >maxCrossing[2]){
            return maxRight;
        }
        return maxCrossing;
    }

    public static void main(String[] args) {
        int[] array = {1,-2,3,-5,2,-1,2,6};
        MaximumSubarray subarray = new MaximumSubarray();
        String s = Arrays.toString(subarray.findMaximumSubarray(array, 0, array.length - 1));
        System.out.println(s);
    }

}
