package nu.kaffekod;

import nu.kaffekod.sequenser.PersonIdSequenser;

import java.util.Objects;

public class Person {
    PersonIdSequenser sequencerInstance = PersonIdSequenser.getInstance();
    private final int id; // Generated id
    private String firstName; // Not allowed to be null
    private String lastName; // Not allowed to be null
    private String email; // Not allowed to be null
    private AppUser credentials;


    public Person(String firstName, String lastName, String email) {
        validInput(firstName, "First name");
        validInput(lastName, "Last name");
        validInput(email, "Email");
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        this.id = sequencerInstance.nextId();
    }


    public int getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        validInput(firstName, "First name");
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        validInput(lastName, "Last name");
        this.lastName = lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        validInput(email, "Email");
        this.email = email;
    }

    public AppUser getCredentials() {
        return credentials;
    }

    public void setCredentials(AppUser credentials) {
        this.credentials = credentials;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(email, person.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, email);
    }

    @Override
    public String toString() {
        return "\nid: " + getId() + "\nFull name: " + getFirstName() + " " + getLastName() + "\nEmail: " + getEmail();
    }


    private static void validInput(String input, String inputName) {
        if(input == null || input.isEmpty()) throw new IllegalArgumentException(inputName + " can't be null or empty");
    }

}
