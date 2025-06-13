package test_partA;

import org.junit.Test;
import partA.Task_2;

import static org.junit.Assert.assertEquals;

public class Task_2_TEST {

    @Test
    public void testCommaAndExclamation() {
        String input = "Привет, мир!";
        int expected = 2;
        assertEquals(expected, Task_2.countPunctuation(input));
    }

    @Test
    public void testThreeDotsAndExclamation() {
        String input = "Нет ничего... совсем!";
        int expected = 4;
        assertEquals(expected, Task_2.countPunctuation(input));
    }

    @Test
    public void testQuestionAndExclamation() {
        String input = "Что ты сказал?!";
        int expected = 2;
        assertEquals(expected, Task_2.countPunctuation(input));
    }

    @Test
    public void testNoPunctuation() {
        String input = "Просто текст без знаков";
        int expected = 0;
        assertEquals(expected, Task_2.countPunctuation(input));
    }

    @Test
    public void testBracketsDashDot() {
        String input = "[]{}— это (скобки).";
        int expected = 7;
        assertEquals(expected, Task_2.countPunctuation(input));
    }
}
