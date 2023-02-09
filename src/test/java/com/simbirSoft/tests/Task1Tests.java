package com.simbirSoft.tests;

import com.simbirSoft.doTasksHere.Task1;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@DisplayName("Юнит-тесты для задачи 1")
public class Task1Tests extends Task1 {

    @CsvSource(value = {
            "4, 16; 4, баз, физ, 7, 8, физ, баз, 11, физ, 13, 14, физбаз, 16",
            "-15, -5; физбаз, -14, -13, физ, -11, баз, физ, -8, -7, физ, баз",
            "15, 0; физбаз, 14, 13, физ, 11, баз, физ, 8, 7, физ, баз, 4, физ, 2, 1, физбаз",
            "0, 0; физбаз",
            "101, 101; 101"
    }, delimiter = ';')
    @ParameterizedTest(name = "Значение на входе: {0}")
    @DisplayName("Позитивные проверки метода task1. ")
    void positiveTests(String value, String result) {

        Assertions.assertThat(Task1.task1(value).equals(result));
    }
}
