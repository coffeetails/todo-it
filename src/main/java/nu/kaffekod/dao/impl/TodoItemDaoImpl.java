package nu.kaffekod.dao;

import nu.kaffekod.TodoItem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TodoItemDaoImpl implements ITodoItemDao {
    private List<TodoItem> todoItemDAOCollection = new ArrayList<>();

    @Override
    public TodoItem persist(TodoItem todoItem) {
        return null;
    }

    @Override
    public TodoItem findById(int id) {
        return null;
    }

    @Override
    public List<TodoItem> findAll() {
        return List.of();
    }

    @Override
    public List<TodoItem> findAllByDoneStatus(boolean done) {
        return List.of();
    }

    @Override
    public List<TodoItem> findAllByTitleContains(String title) {
        return List.of();
    }

    @Override
    public List<TodoItem> findByPersonId(int personId) {
        return List.of();
    }

    @Override
    public List<TodoItem> findByDeadlineBefore(LocalDate date) {
        return List.of();
    }

    @Override
    public List<TodoItem> findByDeadlineAfter(LocalDate date) {
        return List.of();
    }

    @Override
    public void remove(int id) {

    }
}
