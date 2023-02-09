package com.simbirSoft.exampleExecution;

import java.util.Scanner;

public class Task0 {

    // Реализовать консольный ввод - вывод, выполнение метода здесь
    public static void main(String[] args) {
        String inputStr = new Scanner(System.in).nextLine();
        System.out.println(task0(inputStr));
    }

    // Писать основную логику здесь
    protected static Integer task0(String inputStr) {
        int result = 0;
        char[] arraySplitInputStr = inputStr.toCharArray();
        while (result < arraySplitInputStr.length) result++;
        return result;
    }
}