package nu.kaffekod.daoImplTest;

import nu.kaffekod.AppRole;
import nu.kaffekod.AppUser;
import nu.kaffekod.dao.impl.AppUserDaoImpl;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppUserDaoImplTest {
    static AppUserDaoImpl appUserDao = new AppUserDaoImpl();
    static AppUser pelle = new AppUser("PowerPelle", "lösenord",AppRole.ROLE_APP_ADMIN);

    @BeforeEach
    void init() {
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
        List<AppUser> actual = appUserDao.findAll();
        List<AppUser> expected = new ArrayList<>();
        expected.add(pelle);

        assertEquals(expected, actual);
    }

    @Test
    void removeUserByUsername() {
        appUserDao.remove("PowerPelle");
        assertTrue(appUserDao.findAll().isEmpty());
    }

    @AfterEach
    void tearDown() {
        appUserDao.remove("PowerPelle");
    }

}

