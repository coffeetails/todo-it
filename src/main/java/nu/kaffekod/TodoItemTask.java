package nu.kaffekod;

public class TodoItemTask {
    private int id;
    private boolean assigned;
    private TodoItem todoItem; // Not allowed to be null
    private Person assignee;

    public int getId() {
        return this.id;
    }

    public boolean isAssigned() {
        return this.assigned;
    }

    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }

    public TodoItem getTodoItem() {
        return this.todoItem;
    }

    public void setTodoItem(TodoItem todoItem) {
        this.todoItem = todoItem;
    }

    public Person getAssignee() {
        return this.assignee;
    }

    public void setAssignee(Person assignee) {
        this.assignee = assignee;
    }

    public String getSummary() {
        String assigned = "No";
        if(isAssigned()) {
            assigned = getAssignee().getFirstName();
        }
        return "id: " + getId() + "\n assigned: " + assigned + "\n " + "\n todo item: " + getTodoItem().getTitle();
    }
}
