package nu.kaffekod;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class TodoItemTaskTest {
    static Person jdoe = new Person("John", "Doe", "jdoe@protonmail.com");
    static TodoItem todo = new TodoItem("Tvätta fönster", LocalDate.now(), "Använd microduk & fönsterputs", jdoe);
    static TodoItemTask[] todoItemTask = new TodoItemTask[2];

    @BeforeAll
    static void initAll() {
        todoItemTask[0] = new TodoItemTask(todo, jdoe);
        todoItemTask[1] = new TodoItemTask(todo, jdoe);
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
    void equalsTest() {
        assertFalse(todoItemTask[0].equals(todoItemTask[1]));
    }

    @Test
    void hashCodeTest() {
        int actual = todoItemTask[0].hashCode();
        int expected = -1952371026;

        assertEquals(expected, actual);
    }

    @Test
    void toStringTest() {
        String actual = todoItemTask[0].toString();
        String expected = "\nid: 1" + "\nassigned: John Doe\ntodo item: Tvätta fönster";

        assertEquals(expected, actual);
    }


    @Test
    void setWrongTodoItemTest() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> todoItemTask[0].setTodoItem(null));

        String expectedMessage = "Todo item can't be null";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

}
