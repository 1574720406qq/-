package com.wangniubi.stratage;

import java.util.Arrays;

/**
 * @Author: WangGuo
 * @Description:
 * @Date: Created in 7:53 下午 2020/7/26
 * @Modified By:
 */
public class Sorter<T> {
    public void sort(T[] arr, Comparator<T> comparator) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                //arr[j].compareTo(arr[])
                minPos = comparator.compare(arr[j], arr[minPos]) == -1 ? j : minPos;
            }
            swap(arr, i, minPos);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 2, 67};
        //sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
