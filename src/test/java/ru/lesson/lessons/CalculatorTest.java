package ru.lesson.lessons;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        calculator.subtract(4, 3);
        int actual = calculator.getResult();
        int expected = 1;
        assertEquals(expected, actual);

        calculator.subtract(1, 2);
        actual = calculator.getResult();
        expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    void multiplication() {
        Calculator calculator = new Calculator();
        calculator.multiplication(0, 1);
        int actual = calculator.getResult();
        int expected = 0;
        assertEquals(expected, actual);

        calculator.multiplication(9, 9);
        actual = calculator.getResult();
        expected = 81;
        assertEquals(expected, actual);
    }

    @Test
    void division() {
        Calculator calculator = new Calculator();
        calculator.division(0, 1);
        int actual = calculator.getResult();
        int expected = 0;
        assertEquals(expected, actual);

        calculator.division(1, 2);
        actual = calculator.getResult();
        expected = 0;
        assertEquals(expected, actual);

        calculator.division(15, 5);
        actual = calculator.getResult();
        expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    void getResult() {
        Calculator calculator = new Calculator();
        int actual = calculator.getResult();
        int expected = 0;
        assertEquals(expected, actual);

        calculator.summ(0, 1);
        actual = calculator.getResult();
        expected = 1;
        assertEquals(expected, actual);

        calculator.subtract(0, 5);
        actual = calculator.getResult();
        expected = -5;
        assertEquals(expected, actual);
    }

    @Test
    void cleanResult() {
        Calculator calculator = new Calculator();
        calculator.summ(3,1);
        calculator.cleanResult();
        int actual = calculator.getResult();
        int expected = 0;
        assertEquals(expected, actual);
    }
}