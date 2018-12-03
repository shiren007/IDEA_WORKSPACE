package com.hx.sort;

import java.util.Arrays;

/**
 * @author shiren007
 * @date 2018/12/2 0002 - 上午 10:19
 */
public class Choose {

    public static void main(String[] args) {
        int[] arr = {2,6,4,1,3,4,8};

        chooseSort(arr);

        System.out.printf(Arrays.toString(arr));

    }

    private static void chooseSort(int[] arr) {

        if(arr == null || arr.length < 2)
            return;

        sortProcess(arr);
    }

    private static void sortProcess(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j + 1]){
                    swap(arr, j, j + 1);

                }
                
            }
            
        }

    }

    private static void swap(int[] arr, int j, int i) {

        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
