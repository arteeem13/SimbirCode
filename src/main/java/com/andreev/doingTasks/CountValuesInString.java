package com.andreev.doingTasks;

import java.util.Scanner;

public class CountValuesInString {

    // Реализовать консольный ввод - вывод, выполнение метода здесь
    public static void main(String[] args) {
        String inputStr = new Scanner(System.in).nextLine();
        System.out.println(getCountValues(inputStr));
    }

    // Писать основную логику здесь
    protected static Integer getCountValues(String inputStr) {
        int result = 0;
        char[] arraySplitInputStr = inputStr.toCharArray();
        while (result < arraySplitInputStr.length) result++;
        return result;
    }
}