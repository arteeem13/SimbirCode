package com.andreev.unitTests;

import com.andreev.doingTasks.GetMaxValue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DisplayName("Юнит-тесты для задачи - найти наибольшее число из списка")
public class GetMaxValueTests extends GetMaxValue {

    @CsvSource(value = {
            "1; 1",
            "-105, -50, 0; 0",
            "1, 2, 4, 0, 5, 9, 11, 5, 6; 11",
            "5, 5; 5",
            "-500, -501; -500"
    }, delimiter = ';')
    @ParameterizedTest(name = "Значения на входе: {0}. На выходе: {1}")
    @DisplayName("Позитивные проверки метода getMaxValue. ")
    void positiveTests(String value, Integer result) {
        assertThat(GetMaxValue.getMaxValue(value)).isEqualTo(result);
    }
}
