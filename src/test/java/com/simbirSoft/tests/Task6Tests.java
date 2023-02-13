package com.simbirSoft.tests;

import com.simbirSoft.doTasksHere.Task6;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DisplayName("Юнит-тесты для задачи 6 - поиск повторов в трех массивах")
public class Task6Tests extends Task6 {

    @CsvSource(value = {
            "2, 2; 1, 6, 0; [0, 2, 0]",
            "33; 33; [1]",
            "-1, -2, -1, -2, 1, 2, 3; 0, 0, 1, 2; [4, 4, 5, 6]"
    }, delimiter = ';')
    @ParameterizedTest(name = "Значения на входе: {0}; {1}. На выходе: {2}")
    @DisplayName("Проверки метода 6. ")
    void positiveTests(String value1, String value2, String result) {
        assertThat(Task6.task6(value1, value2)).isEqualTo(result);
    }
}
