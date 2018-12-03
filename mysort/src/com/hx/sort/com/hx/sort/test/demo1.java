package com.hx.sort.com.hx.sort.test;

/**
 * @author shiren007
 * @date 2018/12/2 0002 - 上午 10:42
 */

import java.util.Arrays;

/**
 * 给定一个数，将数组中比目标数小的放左边，大的放右边
 */
public class demo1 {
    public static void main(String[] args) {
        int[] arr = {6,8,7,4,3,2,9,0,1};
        int target = 5;
        sort(arr,target);

        System.out.println(Arrays.toString(arr));

    }

    private static void sort(int[] arr, int target) {
        int p1 = 0;
        int p2 = arr.length - 1;

        while(p1 < p2){
            if(arr[p1] > target) {
                swap(arr, p1, p2);
                p2--;
            }else{
                p1++;
            }
        }
    }

    private static void swap(int[] arr, int p1, int p2) {
        int temp = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = temp;
    }

}
