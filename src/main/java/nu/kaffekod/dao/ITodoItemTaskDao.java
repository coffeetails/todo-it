package nu.kaffekod.dao;

import nu.kaffekod.TodoItem;
import nu.kaffekod.TodoItemTask;

import java.util.List;

public interface ITodoItemTaskDao {
    public TodoItemTask persist(TodoItemTask todoItemTask);
    public TodoItemTask findById(int id);
    public List<TodoItemTask> findAll();
    public List<TodoItemTask> findByAssignedStatus(boolean status);
    public List<TodoItemTask> findByPersonId(int personId);
    public void remove(int id);
}
