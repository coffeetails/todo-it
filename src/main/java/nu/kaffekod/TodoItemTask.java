package nu.kaffekod;

public class TodoItemTask {
    private static int sequenser = 0;
    private int id;
    private boolean assigned;
    private TodoItem todoItem; // Not allowed to be null
    private Person assignee;


    public TodoItemTask(TodoItem todoItem, Person assignee) {
        this(todoItem);
        setAssigned(true);
        setAssignee(assignee);
    }

    public TodoItemTask(TodoItem todoItem) {
        isInputValid(todoItem, "Todo item");
        this.id = getNextId();
        setTodoItem(todoItem);
    }


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
        isInputValid(todoItem, "Todo item");
        this.todoItem = todoItem;
    }

    public Person getAssignee() {
        return this.assignee;
    }

    public void setAssignee(Person assignee) {
        this.assignee = assignee;
    }


    private static void isInputValid(TodoItem input, String inputName) {
        if(input == null) throw new IllegalArgumentException(inputName + " can't be null");
    }

    private static int getNextId() {
        return ++sequenser;
    }

    public String getSummary() {
        String assigned = "None";
        if(isAssigned()) {
            assigned = getAssignee().getFirstName() + " " + getAssignee().getLastName();
        }
        return "\nid: " + getId() + "\nassigned: " + assigned + "\ntodo item: " + getTodoItem().getTitle();
    }
}
