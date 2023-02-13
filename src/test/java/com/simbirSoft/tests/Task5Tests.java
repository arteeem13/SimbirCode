package com.simbirSoft.tests;

import com.simbirSoft.doTasksHere.Task5;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DisplayName("Юнит-тесты для задачи 5 - выборка из списка чисел")
public class Task5Tests extends Task5 {

    @CsvSource(value = {
            "Кошка, Кошка, Собака, Медведь; Кошка, Собака, Медведь",
            "5, 10, Book, 10; 5, 10, Book",
            "Машина, машина; Машина",
            "good; good"
    }, delimiter = ';')
    @ParameterizedTest(name = "Значение на входе: {0}. На выходе: {1}")
    @DisplayName("Позитивные проверки метода 5. ")
    void positiveTests(String value, String result) {
        assertThat(Task5.task5(value)).isEqualTo(result);
    }
}
