package ru.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MultipleSwitchWeekTest {

    @Test
    void numberOfDay() {
        int result  = MultipleSwitchWeek.numberOfDay("Monday");
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }
}