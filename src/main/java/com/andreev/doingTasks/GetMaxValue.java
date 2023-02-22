package com.andreev.doingTasks;

import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

/**
 * Написать метод, который на вход принимает целые числа и возвращает максимальное число из массива.
 * (без использования метода sort)
 */

public class GetMaxValue {

    // Реализовать консольный ввод - вывод, выполнение метода здесь
    public static void main(String[] args) {
        String inputStr = new Scanner(System.in).nextLine();
        System.out.println(getMaxValue(inputStr));
    }

    // Писать основную логику здесь
    protected static Integer getMaxValue(String inputStr) {
        List<String> listSplitInputStr = List.of(inputStr.split(", "));
        int maxValue = parseInt(listSplitInputStr.get(0));
        for (int i = 1; i < listSplitInputStr.size(); i++) {
            if (parseInt(listSplitInputStr.get(i)) > maxValue) maxValue = parseInt(listSplitInputStr.get(i));
        }
        return maxValue;
    }
}