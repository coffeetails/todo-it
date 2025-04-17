package nu.kaffekod.dao;

import nu.kaffekod.Person;

import java.util.List;

public interface IPersonDao {
    public Person persist(Person person);
    public Person findById(int id);
    public Person findByEmail(String email);
    public List<Person> findAll();
    public void remove(int id);
}
