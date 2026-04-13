package main.java.stockManager;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Inventory inventory = new Inventory();

        Map<String, Command> commands = new HashMap<>();

        commands.put("add", new AddCommand(scanner, inventory));
        commands.put("list", new ListCommand(inventory));
        commands.put("search", new SearchCommand(scanner, inventory));
        commands.put("remove", new RemoveCommand(scanner, inventory));
        commands.put("update", new UpdateCommand(scanner, inventory));

        while (true) {

            printMenu();

            String input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("exit")) {
                System.out.println("Выход из программы.");
                return;
            }

            Command command = commands.get(input);

            if (command != null) {
                command.execute();
            } else {
                System.out.println("Неизвестная команда.");
            }
        }
    }

    private static void printMenu() {

        System.out.println("""
                Добро пожаловать!
                add     - добавить товар
                list    - показать все товары
                search  - найти товар
                remove  - удалить товар
                update  - изменить товар
                exit    - закрыть программу
                """);
    }
}