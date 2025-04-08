package nu.kaffekod;

import java.time.LocalDate;
import java.util.Objects;

public class TodoItem {
    private static int sequenser = 0;
    private int id; // Generated id
    private String title; // Not allowed to be null or empty
    private String description;
    private LocalDate deadline; // Not allowed to be null
    private boolean done;
    private Person creator;


    public TodoItem(String title, LocalDate deadline, String description, Person creator) {
        this(title, deadline, description);
        setCreator(creator);
    }

    public TodoItem(String title, LocalDate deadline, Person creator) {
        this(title, deadline);
        setCreator(creator);
    }

    public TodoItem(String title, LocalDate deadline, String description) {
        this(title, deadline);
        setDescription(description);
    }

    public TodoItem(String title, LocalDate deadline) {
        validInput(title, "Title");
        validInput(deadline, "Deadline");
        setTitle(title);
        setDeadline(deadline);
        this.id = getNextId();
    }


    public int getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        validInput(title, "Title");
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        validInput(deadline, "Deadline");
        this.deadline = deadline;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Person getCreator() {
        return creator;
    }

    public void setCreator(Person creator) {
        this.creator = creator;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TodoItem todoItem = (TodoItem) o;
        return id == todoItem.id && done == todoItem.done && Objects.equals(title, todoItem.title) && Objects.equals(description, todoItem.description) && Objects.equals(deadline, todoItem.deadline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, deadline, done);
    }

    @Override
    public String toString() {
        String descriptionInfo = "";
        String overdueInfo = "\nStatus: Isn't done";

        if(this.description != null) {
            descriptionInfo = "\nDescription: " + getDescription();
        }
        if(isOverdue() && !isDone()) {
            overdueInfo = "\nStatus: Is overdue";
        } else if (isDone()) {
            overdueInfo = "\nStatus: Is done";
        }

        return "\nid: " + getId() + "\nTitle: " + getTitle() + descriptionInfo + "\nDeadline: " + getDeadline() + overdueInfo;
    }


    private static int getNextId() {
        return ++sequenser;
    }

    public boolean isOverdue() {
        return getDeadline().isBefore(LocalDate.now());
    }

    private static void validInput(String input, String inputName) {
        if(input == null || input.isEmpty()) throw new IllegalArgumentException(inputName + " can't be null or empty");
    }

    private static void validInput(LocalDate input, String inputName) {
        if(input == null) throw new IllegalArgumentException(inputName + " can't be null");
    }

}
