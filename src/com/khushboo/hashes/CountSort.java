package com.khushboo.hashes;

import java.util.Arrays;

public class CountSort {
    public static void countSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        int max = 0;
        for (int num: arr) {
            if (num > max) {
                max =  num;
            }
        }
        int[] countArray = new int[max + 1];

        for (int num:arr) {
            countArray[num]++;
        }
        int index = 0;
        for (int i=0; i<=max; i++) {
            while (countArray[i] > 0) {
                arr[index] =i;
                index++;
                countArray[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 8, 7, 12, 5, 6, 9};
        countSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
