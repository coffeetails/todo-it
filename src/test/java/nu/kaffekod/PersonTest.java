package nu.kaffekod;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    static Person[] jdoe = new Person[1]; // Todo: Figure out why this works

    @BeforeAll
    static void initAll() {
        jdoe[0] = new Person("John", "Doe", "jdoe@protonmail.com");
    }

    @Test
    void getFirstNameTest() {
        assertEquals("John", jdoe[0].getFirstName());
    }
    @Test
    void getLastNameTest() {
        assertEquals("Doe", jdoe[0].getLastName());
    }

    @Test
    void getEmailTest() {
        assertEquals("jdoe@protonmail.com", jdoe[0].getEmail());
    }

    @Test
    void getIdTest() {
        assertEquals(1, jdoe[0].getId());
    }


    @Test
    void setWrongFirstNameTest() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> jdoe[0].setFirstName(""));

        String expectedMessage = "First name can't be null or empty";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
    @Test
    void setWrongLastNameTest() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> jdoe[0].setLastName(""));

        String expectedMessage = "Last name can't be null or empty";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void setWrongEmailTest() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> jdoe[0].setEmail(""));

        String expectedMessage = "Email can't be null or empty";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

}
