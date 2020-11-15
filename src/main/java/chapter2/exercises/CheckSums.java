package chapter2.exercises;

import java.util.Arrays;

/**
 * page 22:2.3-7
 * @author aixiaobai
 * @date 2020/11/15 15:40
 */
public class CheckSums {
    public boolean checkSums(int[] array,int x){
        Arrays.sort(array);
        for(int i = 0;i < array.length;i++){
            if(binarySearch(array,i,x - array[i])){
                return true;
            }
        }
        return false;
    }

    private boolean binarySearch(int[] array, int s,int v){
        int n = array.length - 1 ;
        int mid = n;
        while(n >= s){
            mid = (n + s)/2;
            if(array[mid] == v){
                return true;
            }else if(array[mid] > v){
                n = mid - 1;
            }else{
                s = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        CheckSums checkSums = new CheckSums();
        int[] array = {2, 5, 10, 3, 6, 5, 9};
        System.out.println(checkSums.checkSums(array, 14));
    }

}
