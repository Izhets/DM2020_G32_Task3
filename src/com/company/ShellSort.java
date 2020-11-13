package com.company;

//Хныкин 3.2.
//Сортировка Шелла.
//Лучший O(n log2 n)
//Худший O(n2)

//Сложность по-русски
//Лучшая n
//Средняя n (log n)² или n^(3/2)
//Худшая n (log n)²

import java.util.Arrays;

public class ShellSort {

private static int count = 0;
private static int countReal = 0;

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static int[] shellSort(int[] arr)
    {
        int d = arr.length / 2;
        // Пока разница между элементами есть
        while (d >= 1) {
            for (int right = 0; right < arr.length; right++) {
                count++;
                for (int c = right - d; c >= 0; c -= d) {
                    if (arr[c] > arr[c + d]) {
                        swap(arr, c, c + d);
                    }
                }
            }
            // Пересчитываем разрыв
            d = d / 2;
        }


       return arr;
    }

//Можно выбрать любой шаг
//    public static int[] shellSort(int[] arr){
//        int i, j, k, h, m=0, b=arr.length;
//        int[] d = {3};
//        while (d[m] < b) ++m;
//        while (--m >= 0){
//            k = d[m];
//            for (i = k; i < b; i++){     // k-сортировка
//                count++;
//                j=i;
//                h=arr[i];
//                while ((j >= k) && (arr[j-k] > h)){
//                    arr[j]=arr[j-k];
//                    j -= k;
//                }
//                arr[j] = h;
//            }
//        }
//        return arr;
//    }

    public static void print(int [] arr) {
        String intArrayString = Arrays.toString(arr);
        System.out.println("Результат работы сортировки Шелла: ");
        System.out.println(intArrayString);
        System.out.println("Количество проходов: " + count);
        System.out.println();
    }

}
