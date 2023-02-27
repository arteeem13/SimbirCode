package com.andreev.doingTasks;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

/**
 * Написать функцию, которая на вход принимает строку c целыми числами через пробел и запятую и сортирует
 * методом пузырька
 * В main реализовать ввод строки с консоли, вызов метода getPalindrome и вывод в консоль результат.
 *
 * Принцип действий: обходим массив от начала до конца, попутно меняя местами неотсортированные соседние элементы.
 * В результате первого прохода на последнее место «всплывёт» максимальный элемент. Теперь снова обходим
 * неотсортированную часть массива (от первого элемента до предпоследнего) и меняем по пути неотсортированных соседей.
 * Второй по величине элемент окажется на предпоследнем месте. Продолжая в том же духе, будем обходить всё уменьшающуюся
 * неотсортированную часть массива, запихивая найденные максимумы в конец.
 */

public class BubbleSort {

    // Реализовать консольный ввод - вывод, выполнение метода здесь
    public static void main(String[] args) {
        String inputStr = new Scanner(System.in).nextLine();
        System.out.println(getBubbleSort(inputStr));
    }

    // Писать основную логику здесь
    public static String getBubbleSort(String inputStr) {

        String[] splitStr = inputStr.split(", ");
        int sortedFlag;
        do {
            sortedFlag = 0;
            for (int i = 0; i < splitStr.length - 1; i++) {
                if (parseInt(splitStr[i]) > parseInt(splitStr[i + 1])) {
                    String max = splitStr[i];
                    splitStr[i] = splitStr[i + 1];
                    splitStr[i + 1] = max;
                    sortedFlag++;
                }
            }
        } while (sortedFlag != 0);

        StringBuilder sortedStr = new StringBuilder(splitStr[0]);
        for (int i = 1; i < splitStr.length; i++) {
            sortedStr.append(", ").append(splitStr[i]);
        }

        return sortedStr.toString();
    }
}