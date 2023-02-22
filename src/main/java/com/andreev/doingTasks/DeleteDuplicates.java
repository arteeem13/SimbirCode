package com.andreev.doingTasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Написать метод, который удалит дубликаты слов из строки и вернет пользователю список без дубликатов.
 * Оставить первое слово
 */

public class DeleteDuplicates {

    // Реализовать консольный ввод - вывод, выполнение метода здесь
    public static void main(String[] args) {
        String inputStr = new Scanner(System.in).nextLine();
        System.out.println(deleteDuplicates(inputStr));
    }

    // Писать основную логику здесь
    protected static String deleteDuplicates(String inputStr) {
        List<String> listInputStr = new ArrayList<>(List.of(inputStr.split(", ")));
        if (listInputStr.size() == 1) return inputStr;
        else {
            for (int i = 0; i < listInputStr.size(); i++)
                for (int j = i + 1; j < listInputStr.size(); j++)
                    if (listInputStr.get(j).toLowerCase().equals(listInputStr.get(i).toLowerCase()))
                        listInputStr.remove(j);
            return String.join(", ", listInputStr);
        }
    }
}
