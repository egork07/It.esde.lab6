package test_partA;
import org.junit.Test;
import partA.Task_1;

import static org.junit.Assert.assertEquals;

public class Task_1_TEST{

    @Test
    public void testInsertMiddle() {
        assertEquals("HeXXllo", Task_1.insertAt("Hello", 2, "XX"));
    }

    @Test
    public void testInsertStart() {
        assertEquals("Start-Hello", Task_1.insertAt("Hello", 0, "Start-"));
    }

    @Test
    public void testInsertEnd() {
        assertEquals("Hello-End", Task_1.insertAt("Hello", 5, "-End"));
    }

    @Test
    public void testInsertEmptyText() {
        assertEquals("Insert", Task_1.insertAt("", 0, "Insert"));
    }

    @Test
    public void testInsertEmptyInsert() {
        assertEquals("Hello", Task_1.insertAt("Hello", 3, ""));
    }
}