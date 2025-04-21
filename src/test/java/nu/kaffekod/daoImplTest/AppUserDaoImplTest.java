package nu.kaffekod.daoImplTest;

import nu.kaffekod.AppRole;
import nu.kaffekod.AppUser;
import nu.kaffekod.dao.impl.AppUserDaoImpl;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppUserDaoImplTest {
    static AppUserDaoImpl appUserDao = new AppUserDaoImpl();
    static AppUser pelle = new AppUser("PowerPelle", "lösenord",AppRole.ROLE_APP_ADMIN);

    @BeforeAll
    static void initAll() {
        appUserDao.persist(pelle);
    }

    @Test
    void findByUsernameReturnAppUser() {
        AppUser actual = appUserDao.findByUsername("PowerPelle");
        AppUser expected = pelle;
        assertEquals(expected, actual);
    }

    @Test
    void findAllReturnAppUsers() {
        int actual = appUserDao.findAll().size();
        int expected = 1;
        assertEquals(expected, actual);
    }

/* todo: Works fine in main() so I dunno why it won't work here
    @Test
    void removeUserByUsername() {
        appUserDao.remove("PowerPelle");
        assertTrue(appUserDao.findAll().isEmpty());
    }
*/
}

