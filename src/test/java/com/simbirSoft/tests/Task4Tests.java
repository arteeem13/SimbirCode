package com.simbirSoft.tests;

import com.simbirSoft.doTasksHere.Task4;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DisplayName("Юнит-тесты для задачи 4 - посчитать факториал")
public class Task4Tests extends Task4 {

    @CsvSource(value = {
            "1, 1",
            "2, 2",
            "5, 120",
            "10, 3628800",
            "0, 1",
            "30, 265252859812191058636308480000000",
            "50, 30414093201713378043612608166064768844377641568960512000000000000"
    })
    @ParameterizedTest(name = "Значения на входе: {0}. На выходе: {1}")
    @DisplayName("Позитивные проверки метода task4. ")
    void positiveTests(String value, String result) {
        assertThat(Task4.task4(value)).isEqualTo(result);
    }

    @ValueSource(strings = {
            "-1",
            "-500"
    })
    @ParameterizedTest(name = "Значение на входе: {0}")
    @DisplayName("Негативные проверки метода task4 с результатом 'Error input value!'. ")
    void falseResultTests(String value) {
        assertThat(Task4.task4(value)).isEqualTo("Error input value!");
    }
}
