package nu.kaffekod.daoImplTest;

import nu.kaffekod.Person;
import nu.kaffekod.dao.impl.PersonDaoImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonDaoImplTest {
    static Person eddie = new Person("Eddie", "Hansen", "eddie@protonmail.com");
    static PersonDaoImpl personDao = new PersonDaoImpl();

    @BeforeAll
    static void initAll() {
        personDao.persist(eddie);
    }

    @Test
    void findPersonByIdAndReturnPersonObject() {
        Person actual = personDao.findById(1);
        Person expected = eddie;

        assertEquals(expected, actual);
    }

    @Test
    void findPersonByEmailAndReturnPersonObject() {
        Person actual = personDao.findByEmail("eddie@protonmail.com");
        Person expected = eddie;

        assertEquals(expected, actual);
    }

    @Test
    void findAllPersonsAndGetListOfPersons() {
        int actual = personDao.findAll().size();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    void findAllReturnPersons() {
        int actual = personDao.findAll().size();
        int expected = 1;
        assertEquals(expected, actual);
    }

/* todo
    @Test
    void removeUserByUsername() {
        appUserDao.remove("PowerPelle");
        assertTrue(appUserDao.findAll().isEmpty());
    }
*/
}
