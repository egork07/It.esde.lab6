package partA;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PunctuationCounterTest {

    @Test // Проверяет подсчёт знаков
    public void testCommaAndExclamation() {
        String input = "Hello, world!";
        int expected = 2;
        Assert.assertEquals(expected, partA.PunctuationCounter.countPunctuation(input));
    }

    @Test
    public void testThreeDotsAndExclamation() {
        String input = "There is nothing... at all!";
        int expected = 4;
        Assert.assertEquals(expected, PunctuationCounter.countPunctuation(input));
    }


    @Test
    public void testQuestionAndExclamation() {
        String input = "What did you say?!";
        int expected = 2;
        Assert.assertEquals(expected, partA.PunctuationCounter.countPunctuation(input));
    }

    @Test //Проверяет строку без знаков
    public void testNoPunctuation() {
        String input = "Just text without characters";
        int expected = 0;
        Assert.assertEquals(expected, partA.PunctuationCounter.countPunctuation(input));
    }

    @Test
    public void testBracketsDashDot() {
        String input = "[]{}- it is (brackets).";
        int expected = 8;
        Assert.assertEquals(expected, PunctuationCounter.countPunctuation(input));
    }

}
