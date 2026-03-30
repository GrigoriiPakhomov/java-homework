package main.java.stockManager;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Product> products = new ArrayList<>();

    public void addProduct(String name, int quantity, double price) {
        Product product = new Product(name, quantity, price);
        products.add(product);
        System.out.printf("Товар %s добавлен.", name);
    }

    public void listProducts() {
        if (products.isEmpty()) {
            System.out.println("Склад пуст.");
            return;
        }
        for (Product p : products) {
            System.out.println("- " + p);
        }
    }

    public Product searchProduct(String name) {
        for (Product p : products) {
            if (p.name.equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }

    public void removeProduct(String name) {
        Product p = searchProduct(name);
        if (p != null) {
            products.remove(p);
            System.out.printf("Товар %s удалён.", name);
        } else {
            System.out.println("Товар не найден.");
        }
    }

    public void updateProduct(String name, int quantity, double price) {
        Product p = searchProduct(name);
        if (p != null) {
            p.quantity = quantity;
            p.price = price;
            System.out.printf("Товар %s обновлён.", name);
        } else {
            System.out.println("Товар не найден.");
        }
    }
}