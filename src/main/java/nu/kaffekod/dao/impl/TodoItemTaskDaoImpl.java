package nu.kaffekod.dao.impl;

import nu.kaffekod.TodoItemTask;
import nu.kaffekod.dao.ITodoItemTaskDao;

import java.util.ArrayList;
import java.util.List;

public class TodoItemTaskDaoImpl implements ITodoItemTaskDao {
    private List<TodoItemTask> todoItemTaskDAOCollection = new ArrayList<>();


    @Override
    public TodoItemTask persist(TodoItemTask todoItemTask) {
        todoItemTaskDAOCollection.add(todoItemTask);
        return todoItemTask;
    }

    @Override
    public TodoItemTask findById(int id) {
        for (TodoItemTask todoItemTask : todoItemTaskDAOCollection) {
            if (todoItemTask.getId() == id) {
                return todoItemTask;
            }
        }
        return null;
    }

    @Override
    public List<TodoItemTask> findAll() {
        return todoItemTaskDAOCollection;
    }

    @Override
    public List<TodoItemTask> findByAssignedStatus(boolean status) {
        List<TodoItemTask> tempTodoItemTask = new ArrayList<>();
        for (TodoItemTask todoItemTask : todoItemTaskDAOCollection) {
            if (todoItemTask.isAssigned() == status) {
                tempTodoItemTask.add(todoItemTask);
            }
        }
        return tempTodoItemTask;
    }

    @Override
    public List<TodoItemTask> findByPersonId(int personId) {
        List<TodoItemTask> tempTodoItemTask = new ArrayList<>();
        for (TodoItemTask todoItemTask : todoItemTaskDAOCollection) {
            if (todoItemTask.getAssignee().getId() == personId) {
                tempTodoItemTask.add(todoItemTask);
            }
        }
        return tempTodoItemTask;
    }

    @Override
    public void remove(int id) {
        todoItemTaskDAOCollection.remove(id);
    }
}
