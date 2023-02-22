package com.andreev.unitTests;

import com.andreev.doingTasks.Palindrome;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DisplayName("Юнит-тесты для задачи - определение полиндромности")
public class PalindromeTests extends Palindrome {

    @ValueSource(strings = {
            "111",
            "AfdFa",
            "1 ! 2Aa2 !&* 1",
            "Казак",
            "Ll",
            "Y"
    })
    @ParameterizedTest(name = "Значение на входе: {0}")
    @DisplayName("Проверки метода getPalindrome с результатом true. ")
    void trueResultTests(String value) {
        assertThat(Palindrome.getPalindrome(value)).isTrue();
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
    @DisplayName("Проверки метода getPalindrome с результатом false. ")
    void falseResultTests(String value) {
        assertThat(Palindrome.getPalindrome(value)).isFalse();
    }
}