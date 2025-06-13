package partA;
import org.junit.Assert;
import org.junit.Test;

public class ConcatenaterTest {

    @Test
    public void testInsertMiddle() {
        Assert.assertEquals("HeXXllo", partA.Concatenater.insertAt("Hello", 2, "XX"));
    }

    @Test
    public void testInsertStart() {
        Assert.assertEquals("Start-Hello", partA.Concatenater.insertAt("Hello", 0, "Start-"));
    }

    @Test
    public void testInsertEnd() {
        Assert.assertEquals("Hello-End", partA.Concatenater.insertAt("Hello", 5, "-End"));
    }

    @Test
    public void testInsertEmptyText() {
        Assert.assertEquals("Insert", partA.Concatenater.insertAt("", 0, "Insert"));
    }

    @Test
    public void testInsertEmptyInsert() {
        Assert.assertEquals("Hello", partA.Concatenater.insertAt("Hello", 3, ""));
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testInsertNegativePosition() {
        partA.Concatenater.insertAt("Hello", -1, "XX");
    }

    @Test(expected = NullPointerException.class)
    public void testInsertNullText() {
        partA.Concatenater.insertAt(null, 0, "Insert");
    }

    @Test
    public void testInsertNullInsert() {
        Assert.assertEquals("Helnulllo", partA.Concatenater.insertAt("Hello", 3, null));
    }

}