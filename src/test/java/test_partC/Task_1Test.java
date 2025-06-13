package test_partC;

import org.junit.jupiter.api.Test;
import partC.Task_1;

import static org.junit.jupiter.api.Assertions.*;

public class Task_1Test {

    // правильное преобразование
    @Test
    public void testEncodeWord_Hello() {
        String result = Task_1.encodeWord("HELLO");
        assertEquals("43556", result);
    }

    // преобразование слова в нижнем регистре
    @Test
    public void testEncodeWord_JavaLowercase() {
        String result = Task_1.encodeWord("java");
        assertEquals("5282", result);
    }

    // слово с недопустимым символом
    @Test
    public void testEncodeWord_InvalidChar() {
        assertThrows(NullPointerException.class, () -> {
            Task_1.encodeWord("C0DE"); // '0' не содержится в мапе -> NPE
        });
    }

    // пустая строка
    @Test
    public void testEncodeWord_EmptyString() {
        String result = Task_1.encodeWord("");
        assertEquals("", result);
    }

    // передан null
    @Test
    public void testEncodeWord_NullInput() {
        assertThrows(NullPointerException.class, () -> {
            Task_1.encodeWord(null);
        });
    }
}

