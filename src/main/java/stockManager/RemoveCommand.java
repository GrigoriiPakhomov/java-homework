package main.java.stockManager;


import main.java.stockManager.Inventory;

import java.util.Scanner;

public class RemoveCommand implements Command {

    private final Scanner scanner;
    private final Inventory inventory;

    public RemoveCommand(Scanner scanner, Inventory inventory) {
        this.scanner = scanner;
        this.inventory = inventory;
    }

    @Override
    public void execute() {

        System.out.print("Введите название товара: ");
        String name = scanner.nextLine();

        inventory.removeProduct(name);
    }
}
