package main.java.stockManager;


import main.java.stockManager.Inventory;

import java.util.Scanner;

public class AddCommand implements Command {

    private final Scanner scanner;
    private final Inventory inventory;

    public AddCommand(Scanner scanner, Inventory inventory) {
        this.scanner = scanner;
        this.inventory = inventory;
    }

    @Override
    public void execute() {

        System.out.print("Введите название товара: ");
        String name = scanner.nextLine();

        System.out.print("Введите количество: ");
        int quantity = Integer.parseInt(scanner.nextLine());

        System.out.print("Введите цену: ");
        double price = Double.parseDouble(scanner.nextLine());

        inventory.addProduct(name, quantity, price);
    }
}