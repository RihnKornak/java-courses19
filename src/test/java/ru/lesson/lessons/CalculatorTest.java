package ru.lesson.lessons;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void summ() {
        Calculator calculator = new Calculator();
        calculator.summ(5, 5);
        int actual = calculator.getResult();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    void subtract() {
        Calculator calculator = new Calculator();
        calculator.subtract(4, 4);
        int actual = calculator.getResult();
        int expected = 0;
        assertEquals(expected, actual);

        calculator.subtract(1, 2);
        actual = calculator.getResult();
        expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    void multiplication() {
    }

    @Test
    void division() {
    }

    @Test
    void getResult() {
    }

    @Test
    void cleanResult() {
    }
}