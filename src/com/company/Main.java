package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("Введен массив: ");

        //случай
        int[] arr = {208, 353, 395, 47, 104, 9, 96, 323, 553, 13, 44};
        //int[] arr = {208, 353, 395, 47, 104, 9, 96, 323, 553};

        String intArrayString = Arrays.toString(arr);
        System.out.println(intArrayString);
        System.out.println("Длинной: " + arr.length);
        System.out.println();

        //Сортируем массив пузырьковой сортировкой
        int [] bubbleSortArray = BubbleSort.bubbleSort(arr);
        BubbleSort.print(bubbleSortArray);

        //arr = new int[]{9, 47, 96, 104, 208, 323, 353, 395, 553};
        arr = new int[]{208, 353, 395, 47, 104, 9, 96, 323, 553, 13, 44};

        //Сортируем массив бинарными вставками
        int [] shellSortArray = ShellSort.shellSort(arr);
        ShellSort.print(shellSortArray);

    }
}
