package com.hx.sort;

import java.util.Arrays;

/**
 * @author shiren007
 * @date 2018/12/2 0002 - 上午 8:59
 */
public class Insert {

    public static void main(String[] args) {
        int[] arr = {1,3,5,2,8,4};

        insertSort(arr);

        System.out.printf(Arrays.toString(arr));
    }

    private static void insertSort(int[] arr) {
        if(arr == null || arr.length < 2)
            return;

        insertProcess(arr);

    }

   /* private static void insertProcess(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {

                swap(arr , j , j + 1);
            }
        }
    }*/

    private static void insertProcess(int[] arr) {
        for (int i = 1; i < arr.length; i++) {

            for (int j = i - 1; j > 0  ; j--) {
                if(arr[j] > arr[j + 1]){
                    swap(arr, j, j + 1);
                }else{
                    break;
                }
            }
            
        }

    }

    private static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
