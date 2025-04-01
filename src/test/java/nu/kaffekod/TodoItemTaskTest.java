package nu.kaffekod;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class TodoItemTaskTest {
    static Person jdoe = new Person("John", "Doe", "jdoe@protonmail.com");
    static TodoItem todo = new TodoItem("Tvätta fönster", LocalDate.now(), "Använd microduk & fönsterputs", jdoe);
    static TodoItemTask[] todoItemTask = new TodoItemTask[1];

    @BeforeAll
    static void initAll() {
        todoItemTask[0] = new TodoItemTask(todo, jdoe);
    }

    @Test
    void isAssignedTest() {
        assertTrue(todoItemTask[0].isAssigned());
    }

    @Test
    void getTodoItemTest() {
        assertEquals(todo, todoItemTask[0].getTodoItem());
    }

    @Test
    void getAssigneeTest() {
        assertEquals(jdoe, todoItemTask[0].getAssignee());
    }

    @Test
    void getSummaryTest() {
        String actualSummary = todoItemTask[0].getSummary();
        String expectedSummary = "\nid: 1" + "\nassigned: John Doe\ntodo item: Tvätta fönster";

        assertEquals(expectedSummary, actualSummary);
    }

    @Test
    void setWrongTodoItemTest() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> todoItemTask[0].setTodoItem(null));

        String expectedMessage = "Todo item can't be null";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

}
