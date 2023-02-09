package com.simbirSoft.tests;

import com.simbirSoft.doTasksHere.Task2;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("Юнит-тесты для задачи 2")
public class Task2Tests extends Task2 {

    @ValueSource(strings = {
            "111",
            "AfdFa",
            "1 ! 2Aa2 !&* 1",
            "Ll",
            "Y"
    })
    @ParameterizedTest(name = "Значение на входе: {0}")
    @DisplayName("Проверки метода task2 с результатом true. ")
    void trueResultTests(String value) {
        Assertions.assertThat(Task2.task2(value).equals(true));
    }

    @ValueSource(strings = {
            "1a",
            "AAfa",
            "sSasSa",
            "abab",
            "@$%",
            "@@"
    })
    @ParameterizedTest(name = "Значение на входе: {0}")
    @DisplayName("Проверки метода task2 с результатом false. ")
    void falseResultTests(String value) {
        Assertions.assertThat(Task2.task2(value).equals(false));
    }
}
