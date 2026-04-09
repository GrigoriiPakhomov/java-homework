package main.java.stockManager;


import main.java.stockManager.Inventory;

public class ListCommand implements Command {

    private final Inventory inventory;

    public ListCommand(Inventory inventory) {
        this.inventory = inventory;
    }

    @Override
    public void execute() {
        inventory.listProducts();
    }
}
