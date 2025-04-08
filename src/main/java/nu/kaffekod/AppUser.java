package nu.kaffekod;

import java.util.Objects;

public class AppUser {
    String username; // Not allowed to be null or empty
    String password; // Not allowed to be null or empty
    AppRole role; // Not allowed to be null


    public AppUser(String username, String password, AppRole role) {
        setUsername(username);
        setPassword(password);
        setRole(role);
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        validInput(username, "Username");
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        validInput(password, "Password");
        this.password = password;
    }

    public AppRole getRole() {
        return role;
    }

    public void setRole(AppRole role) {
        validInput(role);
        this.role = role;
    }


    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        AppUser appUser = (AppUser) object;
        return Objects.equals(username, appUser.username) && role == appUser.role;
    }
    @Override
    public int hashCode() {
        return Objects.hash(username, role);
    }
    @Override
    public String toString() {
        return "\napp user: " + getUsername() + "\nroll: " + getRole();
    }


    private static void validInput(String input, String inputName) {
        if(input == null || input.isEmpty()) throw new IllegalArgumentException(inputName + " can't be null or empty");
    }
    private static void validInput(AppRole input) {
        if(input == null) throw new IllegalArgumentException("Role can't be null");
    }
}

