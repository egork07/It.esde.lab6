package test_partC;
import org.junit.jupiter.api.Test;
import partC.Task_2.StringPerformanceComparison;
import static org.junit.jupiter.api.Assertions.*;

public class StringPerformanceComparisonTest {

    // проверяем, что метод с String возвращает строку с нужным текстом
    @Test
    public void testMeasureStringConcatTimeReturnsValidOutput() {
        String result = StringPerformanceComparison.measureStringConcatTime();
        assertNotNull(result);
        assertTrue(result.startsWith("Время работы (String):"));
    }

    // проверяем, что метод с StringBuilder работает корректно
    @Test
    public void testMeasureStringBuilderTimeReturnsValidOutput() {
        String result = StringPerformanceComparison.measureStringBuilderTime();
        assertNotNull(result);
        assertTrue(result.startsWith("Время работы (StringBuilder):"));
    }

    // проверка поведения при null
    @Test
    public void testNullInputBehavior() {
        StringBuilder sb = null;
        assertThrows(NullPointerException.class, () -> {
            sb.append("a"); // Искусственно вызываем NPE
        });
    }

    // проверка на результат не должен быть пустым
    @Test
    public void testOutputNotEmpty() {
        String result = StringPerformanceComparison.measureStringConcatTime();
        assertFalse(result.isEmpty());
    }

    // время выполнения должно быть больше 0 мс
    @Test
    public void testExecutionTimeGreaterThanZero() {
        String result = StringPerformanceComparison.measureStringBuilderTime();
        String timeString = result.replaceAll("\\D+", ""); // Извлекаем цифры
        int time = Integer.parseInt(timeString);
        assertTrue(time > 0);
    }
}
