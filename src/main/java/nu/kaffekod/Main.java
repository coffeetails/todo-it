package nu.kaffekod;


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

        Person[] people = new Person[]{
                new Person("Pelle", "Påhittad", "pelle@protonmail.com"),
                new Person("Eddie", "Hansen", "eddie@protonmail.com")
        };

        for(Person person : people) {
            System.out.println(person);
        }

        System.out.println("\n=========");

        TodoItem[] todoItems = new TodoItem[]{
            new TodoItem("Dammsuga", LocalDate.parse("2025-01-30")),
            new TodoItem("Tvätta", LocalDate.parse("2025-02-13"), people[1]),
            new TodoItem("Skura", LocalDate.parse("2025-01-30"), people[0]),
            new TodoItem("Damma takfläkten", LocalDate.parse("2025-08-01"), "Använd fuktig trasa"),
            new TodoItem("Tvätta fönster", LocalDate.parse("2025-08-01"), "Använd microduk & fönsterputs", people[0])
        };
        todoItems[0].setDone(true);
        todoItems[3].setDone(true);

        for(TodoItem todoItem : todoItems) {
            System.out.println(todoItem);
        }

        System.out.println("\n=========");

        TodoItemTask[] todoItemTasks = new TodoItemTask[]{
            new TodoItemTask(todoItems[0]),
            new TodoItemTask(todoItems[1], people[1]),
            new TodoItemTask(todoItems[2], people[1])
        };

        for(TodoItemTask todoItemTask : todoItemTasks) {
            System.out.println(todoItemTask);
        }

        System.out.println("\n=========");

        AppUser[] appUsers = new AppUser[]{
                new AppUser("PowerPelle", "lösenord", AppRole.ROLE_APP_ADMIN),
                new AppUser("EddieEddaSkrivaren", "lösenord", AppRole.ROLE_APP_USER),
        };

        for(AppUser appUser : appUsers) {
            System.out.println(appUser);
        }

        System.out.println("\n=========");
    }
}