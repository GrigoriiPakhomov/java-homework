package main.java.stockManager;

public record Product(String name, int quantity, double price) {

    @Override
    public String toString() {
        return String.format("%s | Количество: %d | Цена: %.2f",
                name, quantity, price);
    }
}