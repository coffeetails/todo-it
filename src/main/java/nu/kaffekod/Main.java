package nu.kaffekod;


import nu.kaffekod.dao.impl.AppUserDaoImpl;
import nu.kaffekod.dao.impl.PersonDaoImpl;
import nu.kaffekod.dao.impl.TodoItemDaoImpl;
import nu.kaffekod.dao.impl.TodoItemTaskDaoImpl;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        System.out.print(
        "\n    (`/\\" +
        "\n    `=\\/\\" +
        "\n     `=\\/\\        Todo IT" +
        "\n      `=\\/" +
        "\n         \\   Let's get stuff done! "
        );

        System.out.println("\n==========");
        System.out.println(  "= PEOPLE =");

        Person[] people = new Person[]{
                new Person("Pelle", "Påhittad", "pelle@protonmail.com"),
                new Person("Eddie", "Hansen", "eddie@protonmail.com")
        };

        PersonDaoImpl personDao = new PersonDaoImpl();
        for(Person person : people) {
            personDao.persist(person);

        }
        System.out.println(personDao.findAll().toString());

        System.out.println("\n=============");
        System.out.println(  "= TODO ITEM =");

        TodoItem[] todoItems = new TodoItem[]{
            new TodoItem("Dammsuga", LocalDate.parse("2025-01-30")),
            new TodoItem("Tvätta", LocalDate.parse("2025-02-13"), people[1]),
            new TodoItem("Skura", LocalDate.parse("2025-01-30"), people[0]),
            new TodoItem("Damma takfläkten", LocalDate.parse("2025-08-01"), "Använd fuktig trasa"),
            new TodoItem("Tvätta fönster", LocalDate.parse("2025-08-01"), "Använd microduk & fönsterputs", people[0])
        };
        todoItems[0].setDone(true);
        todoItems[3].setDone(true);

        TodoItemDaoImpl todoItemDao = new TodoItemDaoImpl();
        for(TodoItem todoItem : todoItems) {
            todoItemDao.persist(todoItem);
        }
        System.out.println(todoItemDao.findAll().toString());

        System.out.println("\n==================");
        System.out.println(  "= TODO ITEM TASK =");

        TodoItemTask[] todoItemTasks = new TodoItemTask[]{
            new TodoItemTask(todoItems[0]),
            new TodoItemTask(todoItems[1], people[1]),
            new TodoItemTask(todoItems[2], people[1])
        };

        TodoItemTaskDaoImpl todoItemTaskDao = new TodoItemTaskDaoImpl();
        for(TodoItemTask todoItemTask : todoItemTasks) {
            todoItemTaskDao.persist(todoItemTask);
        }
        System.out.println(todoItemTaskDao.findAll().toString());

        System.out.println("\n============");
        System.out.println(  "= APP USER =");

        AppUser[] appUsers = new AppUser[]{
                new AppUser("PowerPelle", "lösenord", AppRole.ROLE_APP_ADMIN),
                new AppUser("EddieEddaSkrivaren", "lösenord", AppRole.ROLE_APP_USER),
        };

        AppUserDaoImpl appUserDao = new AppUserDaoImpl();
        for(AppUser appUser : appUsers) {
            appUserDao.persist(appUser);
        }
        appUserDao.remove("PowerPelle");
        System.out.println(appUserDao.findAll().toString());

        System.out.println("\n=========");

    }
}