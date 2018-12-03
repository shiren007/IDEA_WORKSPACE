package com.hx.sort;

import java.util.Arrays;

/**
 * @author shiren007
 * @date 2018/12/2 0002 - 上午 10:29
 */
public class Merge {

    public static void main(String[] args) {
        int[] arr = {2,6,4,1,3,4,8};

        mergeSort(arr);

        System.out.printf(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr) {

        if(arr == null || arr.length < 2)
            return;

        mergeSort(arr, 0, arr.length - 1);
    }

    private static void mergeSort(int[] arr, int l, int r) {
        if(l == r)
            return;

        int mid = l + ((r - l ) >> 1);
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);

        merge(arr, l, r, mid);


    }

    private static void merge(int[] arr, int l, int r, int mid) {

        int[] help = new int[r - l + 1];
        int i = 0;
        int p1 = l;
        int p2 = mid + 1;
        while(p1 <= mid && p2 <= r) {
            help[i++] = arr[p1] > arr[p2] ? arr[p2++] : arr[p1++];
        }

        while(p1 <= mid){
            help[i++] = arr[p1++];
        }

        while(p2 <= r){
            help[i++] = arr[p2++];
        }

        for (i = 0; i < help.length; i++) {
            arr[l + i] = help[i];
            
        }
    }
}














