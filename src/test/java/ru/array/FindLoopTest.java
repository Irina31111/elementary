package ru.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FindLoopTest {

    @Test
    void whenFind3Element() {
        int[] numbers = { 1, 20, 3, 444, 5, 6 };
        int result = FindLoop.indexOf(numbers, 20);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenNotFindElement() {
        int[] numbers = { 1, 20, 3, 444, 5, 6 };
        int result = FindLoop.indexOf(numbers, 10);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }
}