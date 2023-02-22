package com.andreev.doingTasks;

import java.math.BigInteger;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

/**
 * Написать функцию, реализующую нахождение факториала рекурсивно
 */

public class Factorial {

    // Реализовать консольный ввод - вывод, выполнение метода здесь
    public static void main(String[] args) {
        String inputStr = new Scanner(System.in).nextLine();
        System.out.println(getFactorial(inputStr));
    }

    // Писать основную логику здесь
    protected static String getFactorial(String inputStr) {
        String result;
        BigInteger factorial = BigInteger.valueOf(1);
        String error_result = "Error input value!";
        int inputValue = parseInt(inputStr);
        if (inputValue == 0) result = String.valueOf(factorial);
        else if (inputValue < 0) result = error_result;
        else {
            for (int i = 1; i <= inputValue; i++) factorial = factorial.multiply(BigInteger.valueOf(i));
            result = String.valueOf(factorial);
        }
        return result;
    }
}
