package com.andreev.doingTasks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;


/**
 * Метод принимает три строки с числами, разделенными запятой и пробелом.
 * Затем метод переводит эти строки в массивы чисел. На выходе числа, разделенные запятой и пробелом,
 * которые присутствуют во всех трех массивах. Если повторяющихся чисел нет, отдать сообщение "No repeats"
 */

public class SelectedFromThreeArrays {

    // Реализовать консольный ввод - вывод, выполнение метода здесь
    public static void main(String[] args) {
        String inputStr1 = new Scanner(System.in).nextLine();
        String inputStr2 = new Scanner(System.in).nextLine();
        String inputStr3 = new Scanner(System.in).nextLine();
        System.out.println(getSelectedFromThreeArrays(inputStr1, inputStr2, inputStr3));
    }

    // Писать основную логику здесь
    protected static String getSelectedFromThreeArrays(String inputStr1, String inputStr2, String inputStr3) {
        int[] inputValues1 = strToArray(inputStr1);
        int[] inputValues2 = strToArray(inputStr2);
        int[] inputValues3 = strToArray(inputStr3);
        List<String> outputValues = new ArrayList<>();

        for (int i = 0; i < inputValues1.length; i++)
            for (int j = 0; j < inputValues2.length; j++)
                for (int k = 0; k < inputValues3.length; k++)
                    if (inputValues1[i] == inputValues2[j] && inputValues1[i] == inputValues3[k])
                        outputValues.add(String.valueOf(inputValues1[i]));

        if (outputValues.isEmpty()) return "No repeats";
        else if (outputValues.size() == 1) return outputValues.get(0);
        else {
            outputValues = new ArrayList<>(new HashSet<>(outputValues));
            return String.join(", ", outputValues);
        }
    }

    private static int[] strToArray(String inputStr) {
        List<String> listInputStr = List.of(inputStr.split(", "));
        int[] result = new int[listInputStr.size()];
        for (int i = 0; i < result.length; i++) result[i] = parseInt(listInputStr.get(i));
        return result;
    }
}