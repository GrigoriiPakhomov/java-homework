package main.java.stockManager;

public class Product {
    public String name;
    public int quantity;
    public double price;

    public Product(String name, int quantity, double price){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%s | Количество: %d | Цена: %.2f", name, quantity, price);
    }
}