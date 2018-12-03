package com.hx.sort;

import java.util.Arrays;

/**
 * @author shiren007
 * @date 2018/12/2 0002 - 上午 9:57
 */
public class Bubble {

    public static void main(String[] args) {
        int[] arr = {1,3,5,2,4,8,4};

        bubbleSort(arr);

        System.out.printf(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {

        if(arr == null || arr.length < 2)
            return;

        sortProcess(arr);
    }

    private static void sortProcess(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0 ; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    swap(arr, j , j + 1);
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












