package com.andreev.unitTests;

import com.andreev.doingTasks.BubbleSort;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DisplayName("Юнит-тесты для задачи - реализовать сортировку пузырьком")
public class BubbleSortTests {

    @CsvSource(value = {
            "0, 1, 2; 0, 1, 2",
            "10; 10",
            "5, 3, 4, 5, 0, 1; 0, 1, 3, 4, 5, 5",
            "-1, 0, 1, -1, 0, 1; -1, -1, 0, 0, 1, 1",
            "100, 100; 100, 100"
    }, delimiter = ';')
    @ParameterizedTest(name = "Значения на входе: {0}. На выходе: {1}")
    @DisplayName("Позитивные проверки метода getBubbleSort. ")
    void positiveTests(String value, String result) {
        assertThat(BubbleSort.getBubbleSort(value)).isEqualTo(result);
    }
}