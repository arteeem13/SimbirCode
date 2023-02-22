package com.andreev.doingTasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Написать функцию, которая на вход принимает строку, и возвращает true, если строка является палиндромом,
 * false, если не палиндром.
 * В main реализовать ввод строки с консоли, вызов метода getPalindrome и вывод в консоль результат.
 */

public class Palindrome {

    // Реализовать консольный ввод - вывод, выполнение метода здесь
    public static void main(String[] args) {
        String inputStr = new Scanner(System.in).nextLine();
        System.out.println(getPalindrome(inputStr));
    }

    // Писать основную логику здесь
    protected static Boolean getPalindrome(String inputStr) {
        boolean result = false;
        char[] arraySplitInputStr = inputStr.toLowerCase().toCharArray();
        List<Character> numericAndAlphabet = new ArrayList<>();
        for (char c : arraySplitInputStr) if (Character.isLetterOrDigit(c)) numericAndAlphabet.add(c);
        for (int i = 0; i < numericAndAlphabet.size() / 2 + 1; i++)
            if (numericAndAlphabet.isEmpty() ||
                    !(numericAndAlphabet.get(i).equals(numericAndAlphabet.get(numericAndAlphabet.size() - 1 - i)))) {
                result = false;
                break;
            } else result = true;
        return result;
    }
}