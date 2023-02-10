package com.simbirSoft.tests;

import com.simbirSoft.doTasksHere.Task3;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DisplayName("Юнит-тесты для задачи 3 - найти наибольшее число из списка")
public class Task3Tests extends Task3 {

    @CsvSource(value = {
            "1; 1",
            "-105, -50, 0; 0",
            "1, 2, 4, 0, 5, 9, 11, 5, 6; 11",
            "5, 5; 5",
            "-500, -501; -500"
    }, delimiter = ';')
    @ParameterizedTest(name = "Значения на входе: {0}. На выходе: {1}")
    @DisplayName("Позитивные проверки метода task3. ")
    void positiveTests(String value, Integer result) {
        assertThat(Task3.task3(value)).isEqualTo(result);
    }
}
