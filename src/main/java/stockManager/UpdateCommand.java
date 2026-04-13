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

        String name = InputUtils.readString(scanner,
                "Введите название товара: ");

        int quantity = InputUtils.readInt(scanner,
                "Введите новое количество: ");

        double price = InputUtils.readDouble(scanner,
                "Введите новую цену: ");

        inventory.updateProduct(name, quantity, price);
    }
}
