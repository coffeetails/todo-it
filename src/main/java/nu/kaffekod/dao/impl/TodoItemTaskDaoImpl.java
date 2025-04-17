package nu.kaffekod.dao;

import nu.kaffekod.TodoItemTask;

import java.util.ArrayList;
import java.util.List;

public class TodoItemTaskDaoImpl implements ITodoItemTaskDao {
    private List<TodoItemTask> todoItemTaskDAOCollection = new ArrayList<>();


    @Override
    public TodoItemTask persist(TodoItemTask todoItemTask) {
        return null;
    }

    @Override
    public TodoItemTask findById(int id) {
        return null;
    }

    @Override
    public List<TodoItemTask> findAll() {
        return List.of();
    }

    @Override
    public List<TodoItemTask> findByAssignedStatus(boolean status) {
        return List.of();
    }

    @Override
    public List<TodoItemTask> findByPersonId(int personId) {
        return List.of();
    }

    @Override
    public void remove(int id) {

    }
}
