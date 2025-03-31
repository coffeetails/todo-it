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
        return getDeadline().isBefore(LocalDate.now());
    }

    public String getSummary() {
        String creatorInfo = "";
        String descriptionInfo = "";
        String overdueInfo = "\nStatus: Isn't done";

        if(this.creator != null) {
            creatorInfo = "\nCreator: " + getCreator().getFirstName() + " " + getCreator().getLastName();
        }
        if(this.description != null) {
            descriptionInfo = "\nDescription: " + getDescription();
        }
        if(isOverdue() && !isDone()) {
            overdueInfo = "\nStatus: Is overdue";
        } else if (isDone()) {
            overdueInfo = "\nStatus: Is done";
        }

        return "\nid: " + getId() + creatorInfo + "\nTitle: " + getTitle() + descriptionInfo + "\nDeadline: " + getDeadline() + overdueInfo;
    }
}
