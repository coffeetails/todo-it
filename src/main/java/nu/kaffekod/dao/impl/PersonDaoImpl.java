package nu.kaffekod.dao.impl;

import nu.kaffekod.Person;
import nu.kaffekod.dao.IPersonDao;

import java.util.ArrayList;
import java.util.List;

public class PersonDaoImpl implements IPersonDao {
    private List<Person> personDAOCollection = new ArrayList<>();

    @Override
    public Person persist(Person person) {
        personDAOCollection.add(person);
        return person;
    }

    @Override
    public Person findById(int id) {
        for (Person person : personDAOCollection) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    @Override
    public Person findByEmail(String email) {
        for (Person person : personDAOCollection) {
            if (person.getEmail().equals(email)) {
                return person;
            }
        }
        return null;
    }

    @Override
    public List<Person> findAll() {
        return personDAOCollection;
    }

    @Override
    public void remove(int id) {
        personDAOCollection.remove(id);
    }

}
