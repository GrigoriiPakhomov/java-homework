package main.java.stockManager;


import main.java.stockManager.Inventory;

import java.util.Scanner;

public class UpdateCommand implements Command {

    private final Scanner scanner;
    private final Inventory inventory;

    public UpdateCommand(Scanner scanner, Inventory inventory) {
        this.scanner = scanner;
        this.inventory = inventory;
    }

    @Override
    public void execute() {

        System.out.print("Введите название товара: ");
        String name = scanner.nextLine();

        System.out.print("Введите новое количество: ");
        int quantity = Integer.parseInt(scanner.nextLine());

        System.out.print("Введите новую цену: ");
        double price = Double.parseDouble(scanner.nextLine());

        inventory.updateProduct(name, quantity, price);
    }
}
