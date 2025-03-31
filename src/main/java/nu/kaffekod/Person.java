package nu.kaffekod;

public class Person {
    private static int sequenser = 0;
    private int id; // Generated id
    private String firstName; // Not allowed to be null
    private String lastName; // Not allowed to be null
    private String email; // Not allowed to be null


    public Person(String firstName, String lastName, String email) {
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        this.id = getNextId();
    }


    public int getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private static int getNextId() {
        return ++sequenser;
    }

    public String getSummary() {
        return "\nid: " + getId() + "\nFull name: " + getFirstName() + " " + getLastName() + "\nEmail: " + getEmail();
    }

}
