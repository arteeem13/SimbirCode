package com.andreev.doingTasks;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

/**
 * Написать метод на прием 2 строк с числами, которые разделены запятой и пробелом.
 * Затем метод переводит эти строки в массивы А и Б.
 * На выходе строка из массива С. Массив С заполняется следующим образом:
 * его i-ый элемент равен количеству элементов массива А, которые меньше либо равны i-тому элементу массива Б.
 * Числа в выходной строке разделены запятой и пробелом
 */

public class SelectedFromTwoArrays {

    // Реализовать консольный ввод - вывод, выполнение метода здесь
    public static void main(String[] args) {
        System.out.println("A: ");
        String inputStr1 = new Scanner(System.in).nextLine();
        System.out.println("B: ");
        String inputStr2 = new Scanner(System.in).nextLine();
        System.out.println(getSelectedFromTwoArrays(inputStr1, inputStr2));
    }

    // Писать основную логику здесь
    protected static String getSelectedFromTwoArrays(String inputStr1, String inputStr2) {
        int[] a = strToArray(inputStr1);
        int[] b = strToArray(inputStr2);
        int[] c = new int[b.length];
        int count = 0;
        for (int i = 0; i < b.length; i++) {
            for (int k : a) if (k <= b[i]) count++;
            c[i] = count;
            count = 0;
        }
        return Arrays.toString(c);
    }

    private static int[] strToArray(String inputStr) {
        List<String> listInputStr = List.of(inputStr.split(", "));
        int[] result = new int[listInputStr.size()];
        for (int i = 0; i < result.length; i++) result[i] = parseInt(listInputStr.get(i));
        return result;
    }
}
