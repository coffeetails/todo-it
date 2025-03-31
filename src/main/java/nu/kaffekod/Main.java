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
            System.out.println(person.getSummary());
        }

        System.out.println("\n=========");

        TodoItem[] todoItems = new TodoItem[]{
            new TodoItem("Dammsuga", LocalDate.parse("2025-03-30")),
            new TodoItem("Skura", LocalDate.parse("2025-03-30")),
            new TodoItem("Damma takfläkten", LocalDate.parse("2025-04-01"), "Använd fuktig trasa")
        };

        for(TodoItem todoItem : todoItems) {
            System.out.println(todoItem.getSummary());
        }

        System.out.println("\n=========");

    }
}