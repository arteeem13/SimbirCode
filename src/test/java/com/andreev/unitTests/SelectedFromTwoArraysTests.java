package com.andreev.unitTests;

import com.andreev.doingTasks.SelectedFromTwoArrays;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DisplayName("Юнит-тесты для задачи - выборка из двух массивов и заполнение третьего")
public class SelectedFromTwoArraysTests extends SelectedFromTwoArrays {

    @CsvSource(value = {
            "2, 2; 1, 6, 0; [0, 2, 0]",
            "33; 33; [1]",
            "-1, -2, -1, -2, 1, 2, 3; 0, 0, 1, 2; [4, 4, 5, 6]"
    }, delimiter = ';')
    @ParameterizedTest(name = "Значения на входе: {0}; {1}. На выходе: {2}")
    @DisplayName("Проверки метода getSelectedFromTwoArrays. ")
    void positiveTests(String value1, String value2, String result) {
        assertThat(SelectedFromTwoArrays.getSelectedFromTwoArrays(value1, value2)).isEqualTo(result);
    }
}
