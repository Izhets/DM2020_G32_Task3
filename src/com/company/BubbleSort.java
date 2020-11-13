package com.company;

//Хныкин 3.2.
//Пузырьковая сортировка.
//примерно N^2/2.
//О(N^2) если в "О".

import java.util.Arrays;

public class BubbleSort {

    private static int count = 0;

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static int[] bubbleSort(int[] array) {
        boolean isSorted;
        int nMinusOne = array.length - 1;
        for(int i = 0; i < nMinusOne; i++) {
            isSorted = true;
            for (int j = 0; j < nMinusOne - i; j++) {
                count++;
                if (array[j] > array[j + 1]) {
                    count++;
                    swap(array, j, j + 1);
                    isSorted = false;
                }
            }
            if (isSorted)
                return array;
        }
        return array;
    }


    public static void print(int [] arr) {
        String intArrayString = Arrays.toString(arr);
        System.out.println("Результат работы пузырьковой сортировки: ");
        System.out.println(intArrayString);
        System.out.println("Количество проходов: " + count);
        System.out.println();
    }

}
