package com.simbirSoft.doTasksHere;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {

    // Реализовать консольный ввод - вывод, выполнение метода здесь
    public static void main(String[] args) {
        String inputStr = new Scanner(System.in).nextLine();
        System.out.println(task2(inputStr));
    }

    // Писать основную логику здесь
    protected static Boolean task2(String inputStr) {
        boolean result = false;
        char[] arraySplitInputStr = inputStr.toLowerCase().toCharArray();
        List<Character> numericAndAlphabet = new ArrayList<>();
        for (char c : arraySplitInputStr) if (Character.isLetterOrDigit(c)) numericAndAlphabet.add(c);
        for (int i = 0; i < numericAndAlphabet.size() / 2 + 1; i++)
            if (numericAndAlphabet.isEmpty() ||
                    numericAndAlphabet.get(i) != numericAndAlphabet.get(numericAndAlphabet.size() - 1 - i)) {
                result = false;
                break;
            } else result = true;
        return result;
    }
}
