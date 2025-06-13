package partA;
import org.junit.Assert;
import org.junit.Test;

public class ConcatenaterTest {

    @Test //Проверяет вставку подстроки в середину
    public void testInsertMiddle() {
        Assert.assertEquals("HeXXllo", partA.Concatenater.insertAt("Hello", 2, "XX"));
    }

    @Test //Проверяет вставку строки в начало
    public void testInsertStart() {
        Assert.assertEquals("Start-Hello", partA.Concatenater.insertAt("Hello", 0, "Start-"));
    }

    @Test //Проверяет вставку строки в конец
    public void testInsertEnd() {
        Assert.assertEquals("Hello-End", partA.Concatenater.insertAt("Hello", 5, "-End"));
    }

    @Test// Проверяет вставку в пустую строку
    public void testInsertEmptyText() {
        Assert.assertEquals("Insert", partA.Concatenater.insertAt("", 0, "Insert"));
    }

    @Test //Проверяет вставляемая строка пуста
    public void testInsertEmptyInsert() {
        Assert.assertEquals("Hello", partA.Concatenater.insertAt("Hello", 3, ""));
    }

    @Test //Проверяет вставку с отрицательной позицией
    (expected = StringIndexOutOfBoundsException.class)
    public void testInsertNegativePosition() {
        partA.Concatenater.insertAt("Hello", -1, "XX");
    }

    @Test // при передаче null
            (expected = NullPointerException.class)
    public void testInsertNullText() {
        partA.Concatenater.insertAt(null, 0, "Insert");
    }

    @Test // Проверяет вставку null
    public void testInsertNullInsert() {
        Assert.assertEquals("Helnulllo", partA.Concatenater.insertAt("Hello", 3, null));
    }

}