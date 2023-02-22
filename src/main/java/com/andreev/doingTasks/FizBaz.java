package com.andreev.doingTasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

/**
 * Написать программу, которая на вход принимает 2 параметра: начало и конец диапазона.
 * Затем эта функция перебирает в себе числа в этом диапазоне и выводит на экран по следующему принципу:
 *  если число кратно трем, на экран выводит слово "физ",
 *  если число кратно 5, то выводится слово "баз",
 *  если кратно и 3 и 5 одновременно - "физбаз",
 *  в остальных случаях - выводится само число.
 */

public class FizBaz {

    // Реализовать консольный ввод - вывод, выполнение метода здесь
    public static void main(String[] args) {
        String inputStr = new Scanner(System.in).nextLine();
        System.out.println(getFizBaz(inputStr));
    }

    // Писать основную логику здесь
    protected static String getFizBaz(String inputStr) {
        String result = "";
        List<String> listSplitInputStr = List.of(inputStr.split(", "));
        List<String> listOutputValues = new ArrayList<>();

        int firstValue = parseInt(listSplitInputStr.get(0));
        int secondValue = parseInt(listSplitInputStr.get(1));

        if (secondValue > firstValue) for (int i = firstValue; i <= secondValue; i++) {
            if (i % 3 == 0 && i % 5 != 0) listOutputValues.add("физ");
            else if (i % 5 == 0 && i % 3 != 0) listOutputValues.add("баз");
            else if (i % 5 == 0) listOutputValues.add("физбаз");
            else listOutputValues.add(String.valueOf(i));
        }
        else for (int i = firstValue; i >= secondValue; i--) {
            if (i % 3 == 0 && i % 5 != 0) listOutputValues.add("физ");
            else if (i % 5 == 0 && i % 3 != 0) listOutputValues.add("баз");
            else if (i % 5 == 0) listOutputValues.add("физбаз");
            else listOutputValues.add(String.valueOf(i));
        }
        result = String.join(", ", listOutputValues);
        return result;
    }
}