package nu.kaffekod.daoImplTest;

import nu.kaffekod.Person;
import nu.kaffekod.TodoItem;
import nu.kaffekod.dao.impl.TodoItemDaoImpl;
import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TodoItemDaoImplTest {
    static Person eddie = new Person("Eddie", "Hansen", "eddie@protonmail.com");
    static TodoItem todoItemOne = new TodoItem("Tvätta fönster", LocalDate.now().minusDays(1), "Använd microduk & fönsterputs", eddie);
    static TodoItem todoItemTwo = new TodoItem("Tvätta golv", LocalDate.now().plusDays(1), "Använd snurrmoppen", eddie);
    static TodoItemDaoImpl todoItemDao = new TodoItemDaoImpl();

    @BeforeAll
    static void initAll() {
        //    public TodoItem persist(TodoItem todoItem);
        todoItemOne.setDone(true);
        todoItemDao.persist(todoItemOne);
        todoItemDao.persist(todoItemTwo);
    }

    @Test
    void findTodoItemByIdAndThenReturnTodoItem() {
        //    public TodoItem findById(int id);
        TodoItem actual = todoItemDao.findById(1);
        TodoItem expected = todoItemOne;

        assertEquals(expected, actual);
    }

    @Test
    void findAllTodoItemsAndReturnList() {
        //    public List<TodoItem> findAll();
        List<TodoItem> actual = todoItemDao.findAll();
        List<TodoItem> expected = new ArrayList<>();
        expected.add(todoItemOne);
        expected.add(todoItemTwo);

        assertEquals(expected, actual);
    }

    @Test
    void findAllTodoItemsThatAreDoneAndReturnListOfTodoItems() {
        //    public List<TodoItem> findAllByDoneStatus(boolean done);
        List<TodoItem> actual = todoItemDao.findAllByDoneStatus(true);
        List<TodoItem> expected = new ArrayList<>();
        expected.add(todoItemOne);

        assertEquals(expected, actual);
    }

    @Test
    void findAllTodoItemsByPartialTitleAndReturnListOfTodoItems() {
        //    public List<TodoItem> findAllByTitleContains(String title);
        List<TodoItem> actual = todoItemDao.findAllByTitleContains("fönster");
        List<TodoItem> expected = new ArrayList<>();
        expected.add(todoItemOne);

        assertEquals(expected, actual);
    }

    @Test
    void findAllTodoItemsByPersonIdAndReturnListOfTodoItems() {
        //    public List<TodoItem> findByPersonId(int personId);
        List<TodoItem> actual = todoItemDao.findByPersonId(1);
        List<TodoItem> expected = new ArrayList<>();
        expected.add(todoItemOne);
        expected.add(todoItemTwo);

        assertEquals(expected, actual);
    }

    @Test
    void findAllTodoItemsByDeadlineBeforeTodaysDateAndReturnListOfTodoItems() {
        //    public List<TodoItem> findByDeadlineBefore(LocalDate date);
        List<TodoItem> actual = todoItemDao.findByDeadlineBefore(LocalDate.now());
        List<TodoItem> expected = new ArrayList<>();
        expected.add(todoItemOne);

        assertEquals(expected, actual);
    }

    @Test
    void findAllTodoItemsByDeadlineAfterTodaysDateAndReturnListOfTodoItems() {
        //    public List<TodoItem> findByDeadlineAfter(LocalDate date);
        List<TodoItem> actual = todoItemDao.findByDeadlineAfter(LocalDate.now());
        List<TodoItem> expected = new ArrayList<>();
        expected.add(todoItemTwo);

        assertEquals(expected, actual);
    }

    @AfterAll
    static void tearDownAll() {
        //    public void remove(int id);
        todoItemDao.remove(0);
    }
}
