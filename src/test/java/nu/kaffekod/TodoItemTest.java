package nu.kaffekod;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class TodoItemTest {
    static Person jdoe = new Person("John", "Doe", "jdoe@protonmail.com");
    static TodoItem[] todoItems = new TodoItem[2];

    @BeforeAll
    static void initAll() {
        todoItems[0] = new TodoItem("Tvätta fönster", LocalDate.now(), "Använd microduk & fönsterputs", jdoe);
        todoItems[1] = new TodoItem("Tvätta fönster", LocalDate.now().minusDays(1), "Använd microduk & fönsterputs", jdoe);
    }

    @Test
    void getIdTest() {
        assertEquals(1, todoItems[0].getId());
    }

    @Test
    void getTitleTest() {
        assertEquals("Tvätta fönster",todoItems[0].getTitle());
    }

    @Test
    void getDescriptionTest() {
        assertEquals("Använd microduk & fönsterputs", todoItems[0].getDescription());
    }

    @Test
    void getDeadlineTest() {
        assertEquals(LocalDate.now(), todoItems[0].getDeadline());
    }

    @Test
    void isDoneTest() {
        assertFalse(todoItems[0].isDone());
    }

    @Test
    void isActuallyDoneTest() {
        todoItems[1].setDone(true);
        assertTrue(todoItems[1].isDone());
    }

    @Test
    void getCreatorTest() {
        assertEquals(jdoe, todoItems[0].getCreator());
    }

    @Test
    void isOverdueTest() {
        assertFalse(todoItems[0].isOverdue());
    }
    @Test
    void isActuallyOverdueTest() {
        assertTrue(todoItems[1].isOverdue());
    }

    @Test
    void getSummaryTest() {
        String actualSummary = todoItems[0].getSummary();
        String expectedSummary = "\nid: 1\nCreator: John Doe\nTitle: Tvätta fönster\nDescription: Använd microduk & fönsterputs\nDeadline: " + LocalDate.now() + "\nStatus: Isn't done";
        assertEquals(expectedSummary, actualSummary);
    }

    @Test
    void setWrongDeadline() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> todoItems[1].setDeadline(null));

        String expectedMessage = "Deadline can't be null";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void setWrongTitle() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> todoItems[1].setTitle(""));

        String expectedMessage = "Title can't be null or empty";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}
