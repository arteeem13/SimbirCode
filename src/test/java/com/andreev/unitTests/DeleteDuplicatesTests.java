package com.andreev.unitTests;

import com.andreev.doingTasks.DeleteDuplicates;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DisplayName("Юнит-тесты для задачи - удаление дубликатов")
public class DeleteDuplicatesTests extends DeleteDuplicates {

    @CsvSource(value = {
            "Кошка, Кошка, Собака, Медведь; Кошка, Собака, Медведь",
            "5, 10, Book, 10; 5, 10, Book",
            "Машина, машина; Машина",
            "good; good"
    }, delimiter = ';')
    @ParameterizedTest(name = "Значение на входе: {0}. На выходе: {1}")
    @DisplayName("Позитивные проверки метода deleteDuplicates. ")
    void positiveTests(String value, String result) {
        assertThat(DeleteDuplicates.deleteDuplicates(value)).isEqualTo(result);
    }
}
