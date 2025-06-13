package partC;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFirstTest {

    //обычное совпадение
    @Test
    public void testSimpleMatch() {
        String phoneNumber = "4355696753";
        String[] dictionary = {"HELLO", "WORLD"};
        String result = TaskFirst.findLongestMatch(phoneNumber, dictionary);
        assertEquals("HELLO", result);
    }

    // если несколько совпадают берётся самое длинное
    @Test
    public void testLongestMatch() {
        String phoneNumber = "435569675345356";
        String[] dictionary = {"HELLO", "HELL", "WORLD"};
        String result = TaskFirst.findLongestMatch(phoneNumber, dictionary);
        assertEquals("HELLO", result);
    }

    // ничего не найдено
    @Test
    public void testNoMatch() {
        String phoneNumber = "9999999999";
        String[] dictionary = {"HELLO", "WORLD"};
        String result = TaskFirst.findLongestMatch(phoneNumber, dictionary);
        assertEquals("", result);
    }

    // пустая строка
    @Test
    public void testEmptyPhoneNumber() {
        String phoneNumber = "";
        String[] dictionary = {"HELLO", "WORLD"};
        String result = TaskFirst.findLongestMatch(phoneNumber, dictionary);
        assertEquals("", result);
    }

    // передаётся null
    @Test
    public void testNullPhoneNumber() {
        String[] dictionary = {"HELLO", "WORLD"};
        assertThrows(NullPointerException.class, () -> TaskFirst.findLongestMatch(null, dictionary));
    }
}

