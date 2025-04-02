package nu.kaffekod;

import java.util.Objects;

public class AppUser {
    String username; // Not allowed to be null or empty
    String password; // Not allowed to be null or empty
    AppRole role; // Not allowed to be null


    public AppUser(String username, String password, AppRole role) {

    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        isInputValid(username, "User name");
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        isInputValid(password, "Password");
        this.password = password;
    }

    public AppRole getRole() {
        return role;
    }

    public void setRole(AppRole role) {
        isInputValid(role, "Role");
        this.role = role;
    }


    private static void isInputValid(String input, String inputName) {
        if(input == null || input.isEmpty()) throw new IllegalArgumentException(inputName + " can't be null");
    }
    private static void isInputValid(AppRole input, String inputName) {
        if(input == null) throw new IllegalArgumentException(inputName + " can't be null");
    }

    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        AppUser appUser = (AppUser) o;
        return Objects.equals(username, appUser.username) && role == appUser.role;
    }

    public int hashCode() {
        return Objects.hash(username, role);
    }

    public String toString() {

        return null;
    }
}

