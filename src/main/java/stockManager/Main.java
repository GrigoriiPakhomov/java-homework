package main.java.stockManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventory inventory = new Inventory();

        while (true) {
            System.out.println("""
                    Добро пожаловать!
                    Выберите действие:
                    add     - добавить товар
                    list    - показать все товары
                    search  - найти товар по имени
                    remove  - удалить товар
                    update  - изменить товар
                    exit    - закрыть программу

                    Введите команду:
                    """);

            String input = scanner.nextLine();

            switch (input.trim().toLowerCase()){
                case "add" -> {
                    System.out.print("Введите название товара: ");
                    String name = scanner.nextLine();
                    System.out.print("Введите количество: ");
                    int quantity = Integer.parseInt(scanner.nextLine());
                    System.out.print("Введите цену: ");
                    double price = Double.parseDouble(scanner.nextLine());
                    inventory.addProduct(name, quantity, price);
                }
                case "list" -> inventory.listProducts();
                case "search" -> {
                    System.out.print("Введите название товара для поиска: ");
                    String name = scanner.nextLine();
                    Product p = inventory.searchProduct(name);
                    if (p != null){
                        System.out.println(p);
                    } else {
                        System.out.println("Товар не найден.");
                    }
                }
                case "remove" -> {
                    System.out.print("Введите название товара для удаления: ");
                    String name = scanner.nextLine();
                    inventory.removeProduct(name);
                }
                case "update" -> {
                    System.out.print("Введите название товара для обновления: ");
                    String name = scanner.nextLine();
                    System.out.print("Введите новое количество: ");
                    int quantity = Integer.parseInt(scanner.nextLine());
                    System.out.print("Введите новую цену: ");
                    double price = Double.parseDouble(scanner.nextLine());
                    inventory.updateProduct(name, quantity, price);
                }
                case "exit" -> {
                    System.out.println("Выход из программы.");
                    return;
                }
                default -> System.out.println("Неизвестная команда.");
            }
        }
    }
}