package nu.kaffekod.dao.impl;

import nu.kaffekod.TodoItem;
import nu.kaffekod.dao.ITodoItemDao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TodoItemDaoImpl implements ITodoItemDao {
    private List<TodoItem> todoItemDAOCollection = new ArrayList<>();

    @Override
    public TodoItem persist(TodoItem todoItem) {
        todoItemDAOCollection.add(todoItem);
        return todoItem;
    }

    @Override
    public TodoItem findById(int id) {
        for (TodoItem todoItem : todoItemDAOCollection) {
            if (todoItem.getId() == id) {
                return todoItem;
            }
        }
        return null;
    }

    @Override
    public List<TodoItem> findAll() {
        return todoItemDAOCollection;
    }

    @Override
    public List<TodoItem> findAllByDoneStatus(boolean done) {
        List<TodoItem> tempTodoItems = new ArrayList<>();
        for (TodoItem todoItem : todoItemDAOCollection) {
            if (todoItem.isDone()) {
                tempTodoItems.add(todoItem);
            }
        }
        return tempTodoItems;
    }

    @Override
    public List<TodoItem> findAllByTitleContains(String title) {
        List<TodoItem> tempTodoItems = new ArrayList<>();
        for (TodoItem todoItem : todoItemDAOCollection) {
            if (todoItem.getTitle().contains(title)) {
                tempTodoItems.add(todoItem);
            }
        }
        return tempTodoItems;
    }

    @Override
    public List<TodoItem> findByPersonId(int personId) {
        List<TodoItem> tempTodoItems = new ArrayList<>();
        for (TodoItem todoItem : todoItemDAOCollection) {
            if (todoItem.getCreator().getId() == personId) {
                tempTodoItems.add(todoItem);
            }
        }
        return tempTodoItems;
    }

    @Override
    public List<TodoItem> findByDeadlineBefore(LocalDate date) {
        List<TodoItem> tempTodoItems = new ArrayList<>();
        for (TodoItem todoItem : todoItemDAOCollection) {
            if (todoItem.getDeadline().isBefore(date)) {
                tempTodoItems.add(todoItem);
            }
        }
        return tempTodoItems;
    }

    @Override
    public List<TodoItem> findByDeadlineAfter(LocalDate date) {
        List<TodoItem> tempTodoItems = new ArrayList<>();
        for (TodoItem todoItem : todoItemDAOCollection) {
            if (todoItem.getDeadline().isAfter(date)) {
                tempTodoItems.add(todoItem);
            }
        }
        return tempTodoItems;
    }

    @Override
    public void remove(int id) {
        todoItemDAOCollection.remove(id);
    }
    
}
