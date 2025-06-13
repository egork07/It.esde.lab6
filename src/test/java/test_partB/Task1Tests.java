package test_partB;

import org.junit.jupiter.api.Test;
import partB.Main;
import partB.Text;
import partB.TextParser;

import static org.junit.jupiter.api.Assertions.*;

public class Task1Tests {

    // удаляет слова длины 4 начинающиеся на согласную
    @Test
    public void testRemoveWordsWithLength4AndConsonant() {
        String input = "Test word good frog away.";
        Text text = TextParser.parse(input);
        Text result = Main.performTask1(text, 4);

        assertEquals("away.", result.toString());
    }

    // слова на гласную не удаляются
    @Test
    public void testKeepsWordsStartingWithVowel() {
        String input = "Idea away owl item.";
        Text text = TextParser.parse(input);
        Text result = Main.performTask1(text, 4); // все на гласную

        assertEquals("Idea away owl item.", result.toString());
    }

    // длина не совпадает ничего не удаляется
    @Test
    public void testNoWordsOfTargetLength() {
        String input = "Something bigger survived.";
        Text text = TextParser.parse(input);
        Text result = Main.performTask1(text, 3); // нет слов длины 3

        assertEquals(text.toString(), result.toString());
    }

    // текст из одних символов ничего не происходит
    @Test
    public void testOnlySymbols() {
        String input = "!!! --- ???";
        Text text = TextParser.parse(input);
        Text result = Main.performTask1(text, 3);

        assertEquals(".", result.toString());
    }

    // передаётся null
    @Test
    public void testNullTextThrows() {
        assertThrows(NullPointerException.class, () -> Main.performTask1(null, 5));
    }
}

