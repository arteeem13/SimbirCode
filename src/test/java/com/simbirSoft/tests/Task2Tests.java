package com.simbirSoft.tests;

import com.simbirSoft.doTasksHere.Task2;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DisplayName("Юнит-тесты для задачи 2 - определение полиндромности")
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
        assertThat(Task2.task2(value)).isTrue();
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
        assertThat(Task2.task2(value)).isFalse();
    }
}
