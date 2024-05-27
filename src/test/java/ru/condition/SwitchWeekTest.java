package ru.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SwitchWeekTest {

    @Test
    void nameOfDay() {
        String result = SwitchWeek.nameOfDay(1);
        String expected = "Понедельник";
        assertThat(result).isEqualTo(expected);
    }
}