package test.java.stockManager;

import main.java.stockManager.Inventory;
import main.java.stockManager.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InventoryTest {

    Inventory inventory;

    @BeforeEach
    void setup() {
        inventory = new Inventory();
    }

    @Test
    void testAddProduct() {
        inventory.addProduct("Milk", 10, 2.5);
        Product p = inventory.searchProduct("Milk");
        assertNotNull(p, "Продукт должен быть найден после добавления");
        assertEquals(10, p.quantity(), "Количество должно совпадать");
        assertEquals(2.5, p.price(), "Цена должна совпадать");
    }

    @Test
    void testSearchProductFound() {
        inventory.addProduct("Bread", 5, 1.5);
        Product p = inventory.searchProduct("Bread");
        assertNotNull(p);
        assertEquals("Bread", p.name());
    }

    @Test
    void testSearchProductNotFound() {
        Product p = inventory.searchProduct("Cheese");
        assertNull(p, "Если продукта нет, метод должен вернуть null");
    }

    @Test
    void testRemoveProduct() {
        inventory.addProduct("Eggs", 12, 0.5);
        inventory.removeProduct("Eggs");
        Product p = inventory.searchProduct("Eggs");
        assertNull(p, "Продукт должен быть удалён");
    }

    @Test
    void testRemoveProductNotFound() {
        inventory.removeProduct("Butter");
        Product p = inventory.searchProduct("Butter");
        assertNull(p);
    }

    @Test
    void testUpdateProduct() {
        inventory.addProduct("Juice", 20, 3.0);
        inventory.updateProduct("Juice", 25, 3.5);
        Product p = inventory.searchProduct("Juice");
        assertNotNull(p);
        assertEquals(25, p.quantity());
        assertEquals(3.5, p.price());
    }

    @Test
    void testUpdateProductNotFound() {
        inventory.updateProduct("Soda", 10, 1.0);
        Product p = inventory.searchProduct("Soda");
        assertNull(p, "Не существующий продукт не должен появиться после update");
    }

    @Test
    void testListProductsEmpty() {
        inventory.listProducts();
        assertTrue(inventory.searchProduct("Anything") == null);
    }

    @Test
    void testListProductsNonEmpty() {
        inventory.addProduct("Water", 30, 0.8);
        inventory.addProduct("Chocolate", 15, 2.0);
        inventory.listProducts();
        assertNotNull(inventory.searchProduct("Water"));
        assertNotNull(inventory.searchProduct("Chocolate"));
    }
}