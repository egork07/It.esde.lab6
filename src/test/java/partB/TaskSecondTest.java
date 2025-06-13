package partB;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class TaskSecondTest {

    // проверка сортировки по первой согласной
    @Test
    public void testSortedByFirstConsonant() {
        String input = "Apple elephant orange umbrella idea.";
        Text text = TextParser.parse(input);
        Map<Character, List<String>> result = Main.performTask2(text);

        assertEquals(List.of("apple"), result.get('p'));
        assertEquals(List.of("elephant"), result.get('l'));
        assertEquals(List.of("idea"), result.get('d'));
        assertEquals(List.of("orange"), result.get('r'));
        assertEquals(List.of("umbrella"), result.get('m'));
    }

    // одинаковые первые согласные сортировка по алфавиту
    @Test
    public void testAlphabeticalWithinGroup() {
        String input = "Elephant Eagle Ear Echo.";
        Text text = TextParser.parse(input);
        Map<Character, List<String>> result = Main.performTask2(text);}

    // слова без согласных идут в '_'
    @Test
    public void testNoConsonantsWord() {
        String input = "I a.";
        Text text = TextParser.parse(input);
        Map<Character, List<String>> result = Main.performTask2(text);

        assertEquals(List.of("a", "i"), result.get('_'));
    }

    // текст без слов на гласную
    @Test
    public void testNoVowelStartWords() {
        String input = "Car dog tree.";
        Text text = TextParser.parse(input);
        Map<Character, List<String>> result = Main.performTask2(text);

        assertTrue(result.isEmpty());
    }

    // null вход
    @Test
    public void testNullTextThrows() {
        assertThrows(NullPointerException.class, () -> Main.performTask2(null));
    }

    //проверит при пустом входе результат будет пустым
    @Test
    public void testEmptyString() {
        String input = "";
        Text text = TextParser.parse(input);
        Map<Character, List<String>> result = Main.performTask2(text);
        assertTrue(result.isEmpty());
    }
}
