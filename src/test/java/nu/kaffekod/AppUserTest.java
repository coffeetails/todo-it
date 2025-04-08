package nu.kaffekod;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppUserTest {
    AppUser appUser = new AppUser("johnd","qwerty123", AppRole.ROLE_APP_USER);
    AppUser alsoAppUser = new AppUser("johnd","qwerty123", AppRole.ROLE_APP_USER);

    @Test
    void getUsernameTest() {
        String actual = appUser.getUsername();
        String expected = "johnd";

        assertEquals(expected, actual);
    }

    @Test
    void getPasswordTest() {
        String actual = appUser.getPassword();
        String expected = "qwerty123";

        assertEquals(expected, actual);
    }

    @Test
    void getRoleTest() {
        AppRole actual = appUser.getRole();
        AppRole expected = AppRole.ROLE_APP_USER;

        assertEquals(expected, actual);
    }


    @Test
    void equalsTest() {
        assertTrue(appUser.equals(alsoAppUser));
    }

    @Test
    void hashCodeTest() {
        int actual = appUser.hashCode();
        int expected = 664505000;

        assertEquals(expected,actual);
    }

    @Test
    void toStringTest() {
        String actual = appUser.toString();
        String expected = "\napp user: johnd\nroll: ROLE_APP_USER";
        // The hashcode isn't part of the object itself

        assertEquals(expected, actual);
    }


    @Test
    void setWrongUsernameTest() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> appUser.setUsername(null));

        String expectedMessage = "Username can't be null or empty";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
    @Test
    void setWrongPasswordTest() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> appUser.setPassword(null));

        String expectedMessage = "Password can't be null or empty";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void setRoleTest() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> appUser.setRole(null));

        String expectedMessage = "Role can't be null";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

}
