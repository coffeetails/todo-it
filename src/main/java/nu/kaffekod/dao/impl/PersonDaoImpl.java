package nu.kaffekod.dao;

import nu.kaffekod.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonDaoImpl implements IPersonDao {
    private List<Person> personDAOCollection = new ArrayList<>();

    @Override
    public Person persist(Person person) {
        return null;
    }

    @Override
    public Person findById(int id) {
        return null;
    }

    @Override
    public Person findByEmail(String email) {
        return null;
    }

    @Override
    public List<Person> findAll() {
        return List.of();
    }

    @Override
    public void remove(int id) {

    }

}
