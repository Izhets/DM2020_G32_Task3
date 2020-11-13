package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("Введен массив: ");

        //случай
        //int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr = {208, 353, 395, 47, 104, 9, 96, 323, 553};

        String intArrayString = Arrays.toString(arr);
        System.out.println(intArrayString);
        System.out.println("Длинной: " + arr.length);
        System.out.println();

        //Сортируем массив пузырьковой сортировкой
        int [] bubbleSortArray = BubbleSort.bubbleSort(arr);
        BubbleSort.print(bubbleSortArray);

        arr = new int[]{9, 47, 96, 104, 208, 323, 353, 395, 553};
       // arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //Сортируем массив бинарными вставками
        int [] shellSortArray = ShellSort.shellSort(arr);
        ShellSort.print(shellSortArray);

    }
}
