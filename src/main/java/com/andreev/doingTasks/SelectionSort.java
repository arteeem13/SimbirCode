package com.andreev.doingTasks;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.max;
import static java.lang.Integer.parseInt;

/**
 * Написать функцию, которая на вход принимает строку c целыми числами через пробел и запятую и сортирует
 * методом пузырька
 * В main реализовать ввод строки с консоли, вызов метода getSelectionSort и вывод в консоль результат.
 *
 * Принцип действий: проходим по массиву в поисках максимального элемента. Найденный максимум меняем местами с
 * последним элементом. Неотсортированная часть массива уменьшилась на один элемент (не включает последний элемент,
 * куда мы переставили найденный максимум). К этой неотсортированной части применяем те же действия — находим максимум
 * и ставим его на последнее место в неотсортированной части массива. И так продолжаем до тех пор, пока
 * неотсортированная часть массива не уменьшится до одного элемента.
 */

public class SelectionSort {
    // Реализовать консольный ввод - вывод, выполнение метода здесь
    public static void main(String[] args) {
        String inputStr = new Scanner(System.in).nextLine();
        System.out.println(getSelectionSort(inputStr));
    }

    // Писать основную логику здесь
    public static String getSelectionSort(String inputStr) {

        String[] splitStr = inputStr.split(", ");
        int[] unsortedIntArray = Arrays.stream(splitStr).mapToInt(Integer::parseInt).toArray();
        int[] sortedIntArray = new int[splitStr.length];
        int iterations = splitStr.length - 1;

        do {
            for (int i = 0; i < iterations; i++) {
                int maxValue = max(unsortedIntArray[i], unsortedIntArray[i + 1]);
                sortedIntArray[sortedIntArray.length - 1] = maxValue;
            }
            iterations--;
        } while (iterations != 0);


        StringBuilder sortedStr = new StringBuilder(sortedIntArray[0]);
        for (int i = 1; i < sortedIntArray.length; i++) {
            sortedStr.append(", ").append(sortedIntArray[i]);
        }

        return sortedStr.toString();
    }
}
