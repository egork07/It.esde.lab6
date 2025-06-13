package partB;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFirstTest {

    // удаляет слова длины 4 начинающиеся на согласную
    @Test
    public void testRemoveWordsWithLength4AndConsonant() {
        String input = "Test word good frog away.";
        String expected = "away.";
        Text text = TextParser.parse(input);
        Text result = Main.performTask1(text, 4);

        assertEquals(expected, result.toString());
    }

    // слова на гласную не удаляются
    @Test
    public void testKeepsWordsStartingWithVowel() {
        String input = "Idea away owl item.";
        String expected = "Idea away owl item.";
        Text text = TextParser.parse(input);
        Text result = Main.performTask1(text, 4);

        assertEquals(expected, result.toString());
    }

    // длина не совпадает ничего не удаляется
    @Test
    public void testNoWordsOfTargetLength() {
        String input = "Something bigger survived.";
        String expected = "Something bigger survived.";
        Text text = TextParser.parse(input);
        Text result = Main.performTask1(text, 3);

        assertEquals(expected, result.toString());
    }

    // текст из одних символов ничего не происходит
    @Test
    public void testOnlySymbols() {
        String input = "!!! --- ???";
        String expected = ".";
        Text text = TextParser.parse(input);
        Text result = Main.performTask1(text, 3);

        assertEquals(expected, result.toString());
    }

    // передаётся null
    @Test
    public void testNullTextThrows() {
        assertThrows(NullPointerException.class, () -> Main.performTask1(null, 5));
    }

    //  пустая строка
    @Test
    public void testEmptyString() {
        String input = "";
        String expected = ".";
        Text text = TextParser.parse(input);
        Text result = Main.performTask1(text, 3);
        assertEquals(expected, result.toString());
    }
}
