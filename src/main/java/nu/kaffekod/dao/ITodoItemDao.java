package nu.kaffekod.dao;

import nu.kaffekod.TodoItem;

import java.time.LocalDate;
import java.util.List;

public interface ITodoItemDao {
    public TodoItem persist(TodoItem todoItem);
    public TodoItem findById(int id);
    public List<TodoItem> findAll();
    public List<TodoItem> findAllByDoneStatus(boolean done);
    public List<TodoItem> findAllByTitleContains(String title);
    public List<TodoItem> findByPersonId(int personId);
    public List<TodoItem> findByDeadlineBefore(LocalDate date);
    public List<TodoItem> findByDeadlineAfter(LocalDate date);
    public void remove(int id);
}
