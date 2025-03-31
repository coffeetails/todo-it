package nu.kaffekod;

import java.time.LocalDate;

public class TodoItem {
    private static int sequenser = 0;
    private int id; // Generated id
    private String title; // Not allowed to be null or empty
    private String description;
    private LocalDate deadline; // Not allowed to be null
    private boolean done;
    private Person creator;

    public TodoItem(String title, LocalDate deadline, String description) {
        this(title, deadline);
        setDescription(description);
    }

    public TodoItem(String title, LocalDate deadline) {
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

    private static int getNextId() {
        return ++sequenser;
    }

    public boolean isOverdue() {
        // Todo: Check deadline if overdue
        return true;
    }

    public String getSummary() {
        String creatorInfo = "";
        String descriptionInfo = "";
        if(this.creator != null) {
            creatorInfo = "\nCreator: " + creator.getId() + " " + creator.getLastName();
        }
        if(this.description != null) {
            descriptionInfo = "\nDescription: " + getDescription();
        }
        return "\nid: " + getId() + creatorInfo + "\nTitle: " + getTitle() + descriptionInfo + "\nDeadline: " + getDeadline();
    }
}
