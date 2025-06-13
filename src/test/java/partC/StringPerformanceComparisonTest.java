package partC;
import org.junit.jupiter.api.Test;
import partC.Task_2.StringPerformanceComparison;
import static org.junit.jupiter.api.Assertions.*;

public class StringPerformanceComparisonTest {

    // проверка measureStringConcatTime возвращает положительное значение
    @Test
    public void testMeasureStringConcatTimeIsPositive() {
        long time = StringPerformanceComparison.measureStringConcatTime();
        assertTrue(time > 0, "Execution time for String concatenation should be > 0");
    }

    // проверяет метод measureStringBuilderTime возвращает положительное значение
    @Test
    public void testMeasureStringBuilderTimeIsPositive() {
        long time = StringPerformanceComparison.measureStringBuilderTime();
        assertTrue(time > 0, "Execution time for StringBuilder should be > 0");
    }

    // проверка что метод displayComparison возвращает строку с нужным содержимым
    @Test
    public void testGetComparisonResultFormat() {
        long time1 = 123;
        long time2 = 45;
        String result = StringPerformanceComparison.displayComparison(time1, time2);

        assertTrue(result.contains("Execution time (String): 123 ms"));
        assertTrue(result.contains("Execution time (StringBuilder): 45 ms"));
    }

    // проверка на результат не должен быть пустым
    @Test
    public void testOutputNotEmpty() {
        String result = String.valueOf(StringPerformanceComparison.measureStringConcatTime());
        assertFalse(result.isEmpty());
    }

    // время выполнения должно быть больше 0 мс
    @Test
    public void testExecutionTimeGreaterThanZero() {
        String result = String.valueOf(StringPerformanceComparison.measureStringBuilderTime());
        String timeString = result.replaceAll("\\D+", ""); // Извлекаем цифры
        int time = Integer.parseInt(timeString);
        assertTrue(time > 0);
    }
}
