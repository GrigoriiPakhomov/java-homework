package main.java.stockManager;


import main.java.stockManager.Inventory;
import main.java.stockManager.Product;

import java.util.Scanner;

public class SearchCommand implements Command {

    private final Scanner scanner;
    private final Inventory inventory;

    public SearchCommand(Scanner scanner, Inventory inventory) {
        this.scanner = scanner;
        this.inventory = inventory;
    }

    @Override
    public void execute() {

        System.out.print("Введите название товара: ");
        String name = scanner.nextLine();

        Product product = inventory.searchProduct(name);

        if (product != null) {
            System.out.println(product);
        } else {
            System.out.println("Товар не найден.");
        }
    }
}
